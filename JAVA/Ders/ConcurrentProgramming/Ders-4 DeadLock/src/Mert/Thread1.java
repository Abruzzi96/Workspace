package Mert;

public class Thread1 implements Runnable{

    @Override
    public void run() {
        Deadlock.a.funcA(Deadlock.b);
    }
}
