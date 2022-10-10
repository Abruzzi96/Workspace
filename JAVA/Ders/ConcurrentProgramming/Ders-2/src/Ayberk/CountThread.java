package Ayberk;

public class CountThread extends Thread{

    public CountThread(String name) {
        super(name);
    }

    void mySleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        for(int i = 0; i<100000000; i++){
            System.out.println(this.getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new CountThread("t1");
        Thread t2 = new CountThread("\tt2");

        t1.start();
        //t2.start();
    }
}
