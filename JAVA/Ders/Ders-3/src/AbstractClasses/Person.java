package AbstractClasses;

abstract class Person { //abs was ??
    void printInfo() {
        class Student {
            String studentName;
            String department;
            int ID;
        }
        class Policeman {
            String pDepartment;
            int noOfExperience;
        }
    }

    /*@Override
    public String toString() {
        Object Student = AbstractClasses.Student;
        return super.toString(Student);
    }*/


    abstract void name();

    /* public Person() {
        Student Programmer = new Student("Ambition", "Programmer", 100);
        System.out.println(Programmer.toString());
        Student Programmer2 = new Student("Lust", "Programmer", 111);
        System.out.println(Programmer2.toString());

        Policeman John = new Policeman("CyberCrimelogy", 25);
        System.out.println(John.toString());
        Policeman Aldo = new Policeman("CyberCrimelogy", 50);
        System.out.println(Aldo.toString());
    }
    */





}
/*

Define abstract class Person and extend that classes from Student, Policeman. Person class has abstract method named printInfo(); Person class has name, studneme, ID fields.
                Student class has departments field and policeman class has noOfExperience fields. Create all constructors and accessor methods for these 2 classes. Create at least 2 objects
                for each classes.

 */