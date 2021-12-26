package learnbasicspring.core;

import learnbasicspring.core.data.Bar;
import learnbasicspring.core.data.Foo;
import learnbasicspring.core.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Dependency injection adalah kondisi dimana kita membuat
object, namun object tersebut bergantung dengan object yang lain. Seperti
contoh FooBar dibawah.
 */
/*
Kalau manual maka kita harus membuat object Foo terlebih dahulu dan object Bar terlebih
dahulu
 */
/*
Namun Spring boot memiliki design pattern dependency injection. Sehingga ketika
membuat object yang bergantung dengan object yang lain, maka object "lain" tersebut
akan secara otomatis dibuat.
 */
@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }
    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
