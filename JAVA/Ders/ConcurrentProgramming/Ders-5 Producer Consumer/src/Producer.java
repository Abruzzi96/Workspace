import java.util.LinkedList;

public class Producer implements Runnable{
    LinkedList<Integer> sharedBuffer;
    int capacity;

    public Producer(LinkedList<Integer> sharedBuffer, int capacity) {
        this.sharedBuffer = sharedBuffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        int value = 0;
        while (true){
            synchronized (sharedBuffer){
                while (sharedBuffer.size() >= capacity){
                    try {
                        sharedBuffer.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : produced " + value);
                sharedBuffer.add(value);
                value++;
                sharedBuffer.notify();
            }
        }
    }
}
