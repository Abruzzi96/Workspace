package Singleton;

public class Database {
    private static Database instance; //x

    private Database(){

    }

    public static Database getInstance() {
        if(instance == null)
            instance = new Database(); //x
        return instance;
    }
}
