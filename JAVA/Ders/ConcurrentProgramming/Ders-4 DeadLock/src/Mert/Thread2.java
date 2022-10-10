package Mert;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        Deadlock.b.funcB(Deadlock.a);
    }
}
