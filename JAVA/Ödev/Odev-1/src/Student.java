public class Student extends Person{
    private String department;

    public Student(String name, String surname, int ID, String department) {
        super(name, surname, ID);
        this.department = department;
    }

    @Override
    void printInfo() {
        System.out.println("Name: " + getName() + "\nSurname: " + getSurname() + "\nID: " + getID() + "\nDepartment: " + getDepartment());
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}



