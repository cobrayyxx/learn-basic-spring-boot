package learnbasicspring.core;

import learnbasicspring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    @Test
    public void beanTestCreatedObject(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);

    }

    @Test
    public void testGetBean(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class); //lihat log dia buatnya cuma sekali (pake singleton)
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1,foo2);

    }

}
