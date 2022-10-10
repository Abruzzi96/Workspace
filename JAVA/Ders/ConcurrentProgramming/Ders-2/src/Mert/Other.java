package Mert;

import Ayberk.CountThread;

public class Other extends Thread{

    public Other(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + ":" + i);

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Other("Ayberk");
        Thread t2 = new Other("\tMert");
        t1.start();
        t2.start();
    }


}
