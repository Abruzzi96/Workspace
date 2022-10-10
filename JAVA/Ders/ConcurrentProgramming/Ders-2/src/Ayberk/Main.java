package Ayberk;

public class Main {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new MyThread());
//        Thread t2 = new Thread(new MyThread());
//
//        t1.start();
//        t2.start();

        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}