package Ayberk;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());

        for(int i = 0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + " says: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
