package Mert;

public class MyThread implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " : " + MyThing.getCount());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
