public class Main {
    public static void main(String[] args) {
//        String str = "A215yb1er24k6 7M4e86r/-t56";

        System.out.println(A.x);
        A.x = 15;
        System.out.println(A.x);
    }

    private static String removeUnwanted(String str) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (((int) currentChar >= 65 && (int) currentChar <= 90) || ((int) currentChar >= 97 && (int) currentChar <= 122) || (int) currentChar == 32) {
                ans.append(currentChar);
            }
        }

        return ans.toString();
    }


}

//class OverloadingCalculation3 {
//    void sum(int a, long b) {
//        System.out.println("a method invoked");
//    }
//
//    void sum(long a, int b) {
//        System.out.println("b method invoked");
//    }
//
//    public static void main(String args[]) {
//        OverloadingCalculation3 obj = new OverloadingCalculation3();
//        obj.sum(20, 20);
//    }
//}

//class Base {
//    void method(int a) {
//        System.out.println("Base class method called with integer a = " + a);
//    }
//
//    void method(double d) {
//        System.out.println("Base class method called with double d =" + d);
//    }
//}
//
//class Derived extends Base {
//    @Override
//    void method(double d) {
//        System.out.println("Derived class method called with double d =" + d);
//    }
//}
//
//class X {
//    public static void main(String[] args) {
//        new Derived().method(10);
//    }
//}

//class Base {
//    public void baseMethod() {
//        System.out.println("BaseMethod called ...");
//    }
//}
//
//class Derived extends Base {
//    public void baseMethod() {
//        System.out.println("Derived method called ...");
//    }
//}
//
//class Test {
//    public static void main(String args[]) {
//        Base b = new Derived();
//        b.baseMethod();
//    }
//}

//class Bike9 {
//    final int speedlimit = 90;//final variable
//
//    void run() {
//        speedlimit = 400;
//    }
//
//    public static void main(String args[]) {
//        Bike9 obj = new Bike9();
//        obj.run();
//    }
//}//end of class

//final class Bike{
//}
//
//class Honda1 extends Bike{
//    void run(){
//        System.out.println("running safely with 100kmph");
//    }
//
//    public static void main(String args[]){
//        Honda1 honda= new Honda1();
//        honda.run();
//    }
//}

//class Animal{
//    void eat(){System.out.println("animal is eating...");}
//}
//
//class Dog extends Animal{
//    void eat(){
//        System.out.println("dog is eating...");
//    }
//
//    public static void main(String args[]){
//        Animal a=new Dog();
//        a.eat();
//    }
//}

abstract class Calculate
{
    abstract int multiply(int a, int b);
}

class X
{
    public static void main(String[] args)
    {
        int result = new Calculate() {
            @Override
            int multiply(int a, int b) {
                return a*b;
            }
        }.multiply(12,34);
        System.out.println("result = "+result);
    }
}

