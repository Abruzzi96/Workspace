package Ayberk;

public class Deadlock {
    A a = new A();
    B b = new B();

    private class Thread1 implements Runnable {
        public void run() {
            a.foo(b);
        }
    }

    private class Thread2 implements Runnable {
        public void run() {
            b.bar(a);
        }
    }

    public static void main(String args[]) {
        Deadlock d = new Deadlock();
        Thread t1 = new Thread(d.new Thread1(), "Thread1");
        Thread t2 = new Thread(d.new Thread2(), "Thread2");
        t1.start();
        t2.start();
    }
}