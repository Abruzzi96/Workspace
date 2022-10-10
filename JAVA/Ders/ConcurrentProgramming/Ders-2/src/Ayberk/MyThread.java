package Ayberk;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " Says: " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
