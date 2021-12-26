package learnbasicspring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void testSingletonDatabase(){

        var db1 = Database.getDatabase();
        var db2 = Database.getDatabase();
        //test dia cuma buat satu object
        Assertions.assertEquals(db1,db2);
    }
}
