package ExceptionHandling;

public class Student {
    String name, surname;
    int ID;

    public Student(String name, String surname, int ID) throws InvalidIDException {
        this.name = name;
        this.surname = surname;
        if(ID > 0)
            this.ID = ID;
        else
            throw new InvalidIDException("ID cannot be < 0");
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
