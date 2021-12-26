package learnbasicspring.core;

import learnbasicspring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//kalo ada dua bean dengan tipe data yang sama
// lihat duplicate test
@Configuration
public class DuplicateConfiguration {
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
