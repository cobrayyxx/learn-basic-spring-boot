package learnbasicspring.core;

public class Database {
    private static Database database;

    //bikin biar object database jadi singleton
    public static Database getDatabase() {
        if(database==null){
            database = new Database();
        }
        return database;
    }

    private Database(){

    }
}
