package Mert;
public class Other2 implements Runnable{

    String name;

    public Other2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name + " : " + i );
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Other2("Ayberk"));
        Thread t2 = new Thread(new Other2("\tMert"));
        t1.start();
        t2.start();
    }
}


