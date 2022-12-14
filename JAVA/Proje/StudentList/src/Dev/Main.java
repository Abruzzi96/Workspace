package Dev;

import AVLTree.AVLTree;
import LinkedList.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import LinkedList.*;

public class Main {
    static LinkedList<Student> linkedList = new LinkedList<Student>();
    static AVLTree avlTree = new AVLTree();

    public static void main(String[] args) {
        File file = new File(args[0]);

        try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String readData = scanner.nextLine();
                String[] splitData = readData.split(",");

                int ID = Integer.parseInt(splitData[0]);
                String name = splitData[1];
                String surname = splitData[2];
                String date = splitData[3];
                Gender gender = splitData[4].equals("M") ? Gender.Male : Gender.Female;
                String city = splitData[5];
                String state = splitData[6];
                int zip = Integer.parseInt(splitData[7]);
                String email =  splitData[8];
                int age = Integer.parseInt( splitData[9]);

                Student student = new Student(ID,name,surname,date,gender,city,state,zip,email,age);
                linkedList.append(student);
                avlTree.insert(student.getId(),student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID u wanna look for it : ");
        int input = scanner.nextInt();
        getStudent(input);
        avlTree.getStudent(input);
    }

    static void getStudent(int ID){
        Node<Student> current = linkedList.head;
        while(current != null){
            if(current.data.getId() == ID){
                System.out.println(current.data);
                break;
            }
            current = current.next;
        }
    }
}

/*

        1. Dev.Student s??n??f??n?? olu??tur.
        2. studentList.csv dosyas??n?? oku.
        3. Okunan her bir sat??rdaki veriyi split et. Anlaml?? verileri i??eren bir student objesi olu??tur. ( split() )
        4. Olu??turulan objeyi hem linkedlist hemde AVLTree s??n??f??na insert et.
        5. Kullan??c?? bu 2 veri yap??s?? ??zerinde ID ??zerinden arama yapabilsin.

 */