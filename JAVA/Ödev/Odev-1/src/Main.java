public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mert","Tatar",25,"SE");
        Policeman policeman = new Policeman("Ayberk","Saygı",25,20);

        student.printInfo();
        policeman.printInfo();
    }
}