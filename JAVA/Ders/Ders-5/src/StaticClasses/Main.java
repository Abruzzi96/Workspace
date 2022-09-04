package StaticClasses;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Reptile abc = animal.new Reptile();
        abc.displayInfo();

        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();
    }
}
