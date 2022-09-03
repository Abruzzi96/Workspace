package Example;

public class Student {
    private String name;
    private String surname;
    private int ID;

    public Student() {

    }

    Student(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    Student(Student obj) {
        this.name = obj.name;
        this.surname = obj.surname;
        this.ID = obj.ID;
    }

    void printInfo() {
        System.out.println("Name = " + this.name);
        System.out.println("Surname = " + this.surname);
        System.out.println("ID = " + this.ID);
    }

    int getID() {
        return this.ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    void setID(int ID) {
        this.ID =  ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                '}';
    }
}


