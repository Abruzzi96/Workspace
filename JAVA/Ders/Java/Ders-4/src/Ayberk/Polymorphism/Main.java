package Ayberk.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal alex = new Dog();
        Animal charlie = new Cat();

        System.out.println(alex instanceof Animal);
        System.out.println(charlie instanceof Animal);
    }
}
