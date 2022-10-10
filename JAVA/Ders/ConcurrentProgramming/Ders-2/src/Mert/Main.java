package Mert;

public class Main {
    public static void main(String[] args) {

//        Thread t1 = new Thread(new Alphabet());
//        Thread t2 = new Thread(new Alphabet());
//        t1.start();
//        t2.start();

        Alphabet2 t1 = new Alphabet2();
        Alphabet2 t2 = new Alphabet2();
        t1.start();
        t2.start();

    }
}
