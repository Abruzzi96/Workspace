import java.util.LinkedList;

public class Consumer implements Runnable{
    LinkedList<Integer> sharedBuffer;
    int capacity;

    public Consumer(LinkedList<Integer> sharedBuffer, int capacity) {
        this.sharedBuffer = sharedBuffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedBuffer){
                while (sharedBuffer.size() == 0){
                    try {
                        sharedBuffer.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int value = sharedBuffer.poll();
                System.out.println(Thread.currentThread().getName() + " : consumed " + value);
                sharedBuffer.notify();
            }
        }
    }
}
