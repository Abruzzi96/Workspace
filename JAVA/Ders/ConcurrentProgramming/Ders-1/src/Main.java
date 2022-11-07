public class Main {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        RunnableDemo R2 = new RunnableDemo("Thread-2");

        R1.start();//
        R2.start();

        for(int i = 0; i<1000; i++){
            System.out.println("MAIN = " + i);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
            }
        }

    }
}