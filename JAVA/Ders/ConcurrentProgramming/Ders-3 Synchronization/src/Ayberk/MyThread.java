package Ayberk;

public class MyThread implements Runnable{
    @Override
    public void run() {
        while(true){
            String name = Thread.currentThread().getName();
            int serialNum = MyThing.getCounter();
            System.out.println(name + ": SN = " + serialNum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
