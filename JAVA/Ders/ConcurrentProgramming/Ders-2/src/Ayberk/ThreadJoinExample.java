package Ayberk;

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();

        // start second thread after waiting for 2 seconds or if its dead
        t1.join(2000);
        t2.start();

        // start third thread only when the first thread is dead

        t1.join();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("All threads are dead, exiting main thread!");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread started::" + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread End::" + Thread.currentThread().getName());
    }
}
