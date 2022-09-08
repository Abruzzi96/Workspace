package Mert.Encapsulation;

public class Student extends Person {
    private int ID;

    public Student(String name, String surname, int ID) {
        super(name, surname);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}



