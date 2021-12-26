package learnbasicspring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationContextTest {

    @Test
    void testApplicationContext(){
        // Membuat application context
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class);

        Assertions.assertNotNull(context);
    }

}
