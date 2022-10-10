package Ayberk;

public class CountThreadRunnable implements Runnable{
    String name;

    public CountThreadRunnable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new CountThreadRunnable("t1"));
        Thread t2 = new Thread(new CountThreadRunnable("\tt2"));
        t1.start();
        t2.start();
    }
}
