package Ayberk;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        // Thread.sleep(1000);
        System.out.println(name + ": Ayberk.A.foo is trying to call Ayberk.B.last()");
        b.last();
        System.out.println(name + " exiting Ayberk.A.foo)");
    }

    synchronized void last() {
        System.out.println("Inside Ayberk.A.last");
    }
}
