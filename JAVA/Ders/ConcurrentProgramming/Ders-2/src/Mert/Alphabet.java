package Mert;

public class Alphabet implements Runnable {

    @Override
    public void run() {
        for (int i = 65; i <= 90; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " says " + (char)i);
        }
    }
}
