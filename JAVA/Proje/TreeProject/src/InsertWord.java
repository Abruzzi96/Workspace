import LinkedList.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertWord {
    public static void main(String[] args) {
        File file = new File(args[0]);
        LinkedList<String> linkedList = new LinkedList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                linkedList.append(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What u are looking for ?:");
        String input = scanner.nextLine();

        System.out.println("List contains " + input + " : " + linkedList.contains(input));

    }
}
