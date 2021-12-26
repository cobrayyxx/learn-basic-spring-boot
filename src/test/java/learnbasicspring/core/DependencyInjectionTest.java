package learnbasicspring.core;

import learnbasicspring.core.data.Bar;
import learnbasicspring.core.data.Foo;
import learnbasicspring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    ApplicationContext applicationContext;

    @BeforeEach
    public void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    public void testWithDependencyInjection(){
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
//        Lihat bikin object FooBar tinggal manggil doang, krn udh ada Dependency Injection
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertEquals(foo, fooBar.getFoo());
        Assertions.assertEquals(bar, fooBar.getBar());

    }
    @Test
    public void testWithoutDependencyInjection(){
        Foo foo = new Foo();
        Bar bar = new Bar();
        /*lihat kalo disini buat bikin object FooBar harus buat object Foo
        dan object Bar dulu. Bayangin kalo object Foo dan object Bar bergantung lagi
        dengan object yang lain kan bakal ribet tuh
         */
        FooBar foobar= new FooBar(foo,bar);

        Assertions.assertEquals(foo, foobar.getFoo());
        Assertions.assertEquals(bar, foobar.getBar());



    }
}

