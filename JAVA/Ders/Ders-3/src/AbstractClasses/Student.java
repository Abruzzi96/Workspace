package AbstractClasses;

public class Student extends Person{
    String studentName;
    String department;
    int ID;

    public Student (String studentName, String department, int ID) {
        this.studentName = studentName;
        this.department = department;
        this.ID = ID;
    }


    public String toString()
    {
        return("Hi my name is "+ this.studentName()+
                ".\nMy department and ID are " +
                this.department()+"," + this.ID());
    }

    private int ID() {
        return ID;
    }

    private String department() {
        return department;
    }

    private String studentName() {
        return studentName;
    }

    public static void main(String[] args)
    {
        Student Programmer = new Student("Ambition", "Programmer", 100);
        System.out.println(Programmer.toString());
        Student Programmer2 = new Student("Lust", "Programmer", 111);
        System.out.println(Programmer2.toString());
    }

    /*void printInfo() {
        System.out.println();
    }*/


    @Override
    void name() {

    }
}



