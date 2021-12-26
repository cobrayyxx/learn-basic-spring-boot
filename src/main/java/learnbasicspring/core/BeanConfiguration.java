package learnbasicspring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import learnbasicspring.core.data.Foo;

@Slf4j //untuk mengeluarkan log
@Configuration
public class BeanConfiguration {

    //bean adalah object yang disimpan di container IoC
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("membuat foo");
        return foo;
    }
}
