package learnbasicspring.core;

import learnbasicspring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DuplicateTest {

    @Test
    public void testCallByDataType(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->{
            //dia akan protest manggil foo yang mana
            Foo foo = context.getBean(Foo.class);
        });
    }
    @Test
    public void testCallOnebyOne(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        // manggilnya harus disebutin foo yang mana biar gk protest
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2",Foo.class);
        //lihat foo1 dan foo2 beda tipe data
        Assertions.assertNotEquals(foo1,foo2);
    }
    @Test
    public void testSingleton(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        //cek semua object yang dibikin di foo1 sama
        Foo foo = context.getBean("foo1",Foo.class);
        Foo foo1 = context.getBean("foo1",Foo.class);

        Assertions.assertEquals(foo,foo1);
    }

}
