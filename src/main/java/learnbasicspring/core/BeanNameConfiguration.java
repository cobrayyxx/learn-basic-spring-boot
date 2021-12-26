package learnbasicspring.core;

import learnbasicspring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//gimana kalo pengen nama beannya gk sesuai dengan nama method?
//bisa kita custom pake param value di tag beannya
//tapi ingat setiap bean harus unik namanya!!!!
//lihat BeanNameTest
@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }

}
