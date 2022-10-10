package Mert;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());
        Thread t4 = new Thread(new MyThread());
        Thread t5 = new Thread(new MyThread());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
