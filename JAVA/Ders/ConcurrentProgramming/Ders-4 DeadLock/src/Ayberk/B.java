package Ayberk;

public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        // Thread.sleep(1000);
        System.out.println(name + ": Ayberk.B.bar is trying to call Ayberk.A.last()");
        a.last();
        System.out.println(name + " exiting Ayberk.B.bar)");
    }

    synchronized void last() {
        System.out.println("Inside Ayberk.B.last");
    }
}
