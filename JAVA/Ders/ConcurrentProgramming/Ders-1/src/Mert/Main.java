package Mert;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[1000000000];
        for (int i = 0; i < 1000000000; i++){
            arr[i] = i;
        }

        Thread t1 = new Thread(new RunnableDemo(arr,0,500000000),"Thread-1");
        Thread t2 = new Thread(new RunnableDemo(arr,500000000,arr.length),"Thread-2");

        Date start = new Date();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());


        Thread.sleep(1000);
        System.out.println("Starting Single Thread!");
        Thread.sleep(1000);

        start = new Date();
        for (int i = 0; i < 1000000000; i++){

        }
        end = new Date();

        System.out.println(end.getTime() - start.getTime());
    }
}