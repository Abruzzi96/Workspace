import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Integer> sharedBuffer = new LinkedList<>();

        Thread producer = new Thread(new Producer(sharedBuffer, 2));
        Thread consumer = new Thread(new Consumer(sharedBuffer, 2));

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}