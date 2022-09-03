package Inheritance;

public class Dog extends Animal{

    Dog(){

        System.out.println("Inheritance.Dog");

    }

    //Method Overriding
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    public void display(){
        System.out.println("My name is " + name);
    }

    public void dogSleep(){
        super.sleep();
    }
}
