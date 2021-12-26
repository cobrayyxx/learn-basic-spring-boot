package learnbasicspring.core;

import learnbasicspring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    public void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);

    }
    @Test
    public void testPrimaryBean(){
        //lihat gk error kyk pas test duplicate
        Foo foo = applicationContext.getBean(Foo.class);

        Foo foo1 = applicationContext.getBean("foo1",Foo.class);
        Foo foo2 = applicationContext.getBean("foo2",Foo.class);
        //foo == foo1
        Assertions.assertEquals(foo,foo1);
        Assertions.assertNotEquals(foo,foo2);
        Assertions.assertNotEquals(foo1,foo2);
    }


}
