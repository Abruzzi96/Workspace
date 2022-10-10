package Ayberk;

public class MyThing {
    static int count = 0;

    public static synchronized int getCounter(){
        return count++;
    }


}
