package Mert;

public class MyThing {
    static int count = 0;

    synchronized static int getCount(){
        return count++;
    }
}
