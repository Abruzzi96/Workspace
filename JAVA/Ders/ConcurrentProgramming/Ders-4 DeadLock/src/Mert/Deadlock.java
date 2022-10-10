package Mert;

public class Deadlock {
    static A a = new A();
    static B b = new B();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}
