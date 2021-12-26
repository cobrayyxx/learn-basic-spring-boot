package learnbasicspring.core;

import learnbasicspring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {
    ApplicationContext applicationContext;

    @BeforeEach
    public void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    public void testCallingbyBeanName(){
        Foo foo = applicationContext.getBean(Foo.class);
        /* mulai sekarang kita gk bisa manggil lagi pake nama methodnya(kyk "foo1" atau "foo2",
        karena beannya udh punya nama
         */
        Foo foo1 = applicationContext.getBean("fooFirst",Foo.class);
        Foo foo2 = applicationContext.getBean("fooSecond",Foo.class);

        Assertions.assertEquals(foo,foo1);
        Assertions.assertNotEquals(foo,foo2);
        Assertions.assertNotEquals(foo1,foo2);



    }
}
