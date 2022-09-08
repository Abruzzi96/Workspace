package OOP1;

public class Student {
    private String name; //null
    private String surname; //null
    private int ID; // 0

    Student(){

    }

    Student(String name, String surname, int ID){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
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
