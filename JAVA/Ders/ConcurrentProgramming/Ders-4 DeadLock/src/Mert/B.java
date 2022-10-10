package Mert;

public class B {
    synchronized void funcB(A a){
        System.out.println(Thread.currentThread().getName() + " : B.funcB is trying to call A.last");
        a.last();
        System.out.println(Thread.currentThread().getName() + " : All set, exiting!");
    }
    synchronized void last(){

    }
}
