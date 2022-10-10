package Mert;

public class A {
    synchronized void funcA(B b){
        System.out.println(Thread.currentThread().getName() + " : A.funcA is trying to call B.last");
        b.last();
        System.out.println(Thread.currentThread().getName() + " : All set, exiting!");

    }

    synchronized void last(){

    }
}
