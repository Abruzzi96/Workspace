package Mert;

public class Alphabet2 extends Thread{
    @Override
    public void run() {
        for (int i = 65; i <= 90; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println( Thread.currentThread().getName() + " Says " + (char)i );
        }
    }
}
