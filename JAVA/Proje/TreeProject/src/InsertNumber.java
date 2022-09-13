import AVLTree.AVLTree;
import LinkedList.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {
        File file = new File(args[0]);
        AVLTree tree = new AVLTree();
        LinkedList list = new LinkedList();
        String newLine;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                newLine = scanner.nextLine();
                list.append(Integer.parseInt(newLine));
                tree.insert(Integer.parseInt(newLine));
                System.out.println(newLine + " has been pushed!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR!");
        }
        int input;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("What u are looking for ?:");
            input = scanner.nextInt();

            Date start = new Date();
            System.out.println("List contains " + input + " = " + list.contains(input));
            Date end = new Date();
            System.out.println("Time Passed: " + (end.getTime()-start.getTime()) + "ms");

        } while(input != -1);
    }
 }