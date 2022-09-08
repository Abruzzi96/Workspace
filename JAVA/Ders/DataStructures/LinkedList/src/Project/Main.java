package Project;

import Dev.EmptyListException;
import Dev.InvalidDataException;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PhoneList phoneList = new PhoneList();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("1- Add contact");
            System.out.println("2- Remove contact");
            System.out.println("3- Show contact");
            System.out.println("4- Exit");
            System.out.print("Choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (choice) {
                case 1 -> addContact();
                case 2 -> removeContact();
                case 3 -> showContact();
                case 4 -> System.exit(-1);
                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    private static void showContact() {
        System.out.println("---------------------------------------------");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        try {
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phoneList.getPhoneNum(name));
        } catch (EmptyListException | InvalidDataException e) {
            System.out.println("Exception caught while searching " + name + "!");
        }
    }

    private static void removeContact() {
        System.out.println("---------------------------------------------");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        try {
            phoneList.delete(name);
        } catch (InvalidDataException e) {
            System.out.println("Exception caught while deleting " + name + "!");
        }
    }

    private static void addContact() {
        System.out.println("---------------------------------------------");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Phone Number : ");
        String num = scanner.nextLine();

        phoneList.append(name, num);
    }
}
