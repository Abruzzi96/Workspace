package ExceptionHandling;

public class Manager {

    public static void createStudent(String name, String surname, int ID){
        try {
            Student createdStudent = new Student(name,surname,ID);
            System.out.println("Student created!");
            System.out.println(createdStudent);
        } catch (InvalidIDException e) {
            System.out.println(e.getMessage());
        }

    }
}
