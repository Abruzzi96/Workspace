package Mert;

public class RunnableDemo implements Runnable{
    int[] arr;
    int end,start;

    public RunnableDemo(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++){

        }
    }
}
