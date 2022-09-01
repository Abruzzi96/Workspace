import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Hello");

//        int age = 18;
//        String name = "Ayberk";
//        System.out.println("My age is: " + age + " and my name is: " + name);

//        int age = 25;
//        int AGE = 25;
//
//        System.out.println(AGE);
//        System.out.println(age);

//        int age;
//        age = 20;
//
//        int _age;
//        int $age;

//        // 1. boolean
//
//        boolean x = true;
//        boolean y = true;
//
//        // 2. byte
//        byte range;
//        range = 127;
//        System.out.println(range);
//
//        // 3. short
//
//        short s = 32767;
//        System.out.println(s);
//
//        // 4. int
//
//        int i = 425000000;
//        System.out.println(i);
//
//        // 5. long
//        long l = -421242120542L;
//        System.out.println(l);
//
//        // 6. double
//        double num = 3.14;
//
//        // 7. float
//        float num2 = 3.14f;
//
//        // 8. char
//        char c = 'A';
//
//        // String
//        String name = "Ayberk";
//        System.out.println(name);

        // ClassName objName = new Constructor(params..);
//        Scanner scan = new Scanner(System.in);
//
//        String name;
//        int age;
//
//        System.out.print("Name: ");
//        name = scan.nextLine();
//
//        System.out.print("Age: ");
//        age = scan.nextInt();
//
//        System.out.println("Name: " + name + "\nAge: " + age);

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Name : ");
//        String name = input.nextLine();
//        System.out.print("Surname : ");
//        String surname = input.nextLine();
//        System.out.print("ID :");
//        int ID = input.nextInt();
//
//        System.out.println();
//
//        System.out.println("Name = " + name + "\nSurname = " + surname + "\nID = " + ID);

        /*
            1. Arithmetic Operators
                +
                -
                *
                /
                %
            2. Assignment Operators
                =
                +=
                -=
                *=
                /=
                %=
            3. Relational Operators
                ==
                !=
                >
                <
                >=
                <=
            4. Logical Operators
                &&
                ||
                !
            5. Unary Operators
                ++
                --
            6. Other Operators
                instanceof

         */

//        String str = "Mert";
//        boolean result;
//
//        result = str instanceof String;
//        System.out.println(result);

        // u1234
        // p1234

//        Scanner input = new Scanner(System.in);

//        System.out.print("Username : ");
//        String username = input.nextLine();
//
//        System.out.print("Password : ");
//        String password = input.nextLine();
//
//        if (username.equals("u1234") && password.equals("p1234")){
//            System.out.println("Success");
//        }
//        else if (username.equals("u1234") && !(password.equals("p1234"))) {
//            System.out.println("Pass was wrong");
//        }
//        else if (!(username.equals("u1234")) && password.equals("p1234")) {
//            System.out.println("username was wrong");
//        }
//        else {
//            System.out.println("Both was wrong");
//        }

        // 42 15 34
        // 42>34>15
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Number 1: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Number 2: ");
//        int num2 = input.nextInt();
//
//        System.out.print("Number 3: ");
//        int num3 = input.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            if(num2 > num3) {
//                System.out.println(num1 + ">" + num2 + ">" + num3);
//            }else {
//                System.out.println(num1 + ">" + num3 + ">" + num2);
//            }
//        } else if (num2 > num1 && num2 > num3) {
//            if(num3 > num1) {
//                System.out.println(num2 + ">" + num3 + ">" + num1);
//            }
//
//        }else if (num3 > num1 && num3 > num2) {
//            if(num2 > num1) {
//                System.out.println(num3 + ">" + num2 + ">" + num1);
//            }else {
//                System.out.println(num3 + ">" + num1 + ">" + num2);
//            }
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a num: ");
//        int num = input.nextInt();
//
//        switch (num) {
//            case 1 -> System.out.println("Ocak");
//            case 2 -> System.out.println("Subat");
//            case 3 -> System.out.println("Mart");
//            case 4 -> System.out.println("Nisan");
//            case 5 -> System.out.println("Mayis");
//            case 6 -> System.out.println("Temmuz");
//            case 7 -> System.out.println("Agustos");
//            case 8 -> System.out.println("Haziran");
//            case 9 -> System.out.println("Eylul");
//            case 10 -> System.out.println("Ekim");
//            case 11 -> System.out.println("Kasim");
//            case 12 -> System.out.println("Aralik");
//            default -> System.out.println("Hatali");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.print("Alt limit girin :");
//        int alt = input.nextInt();
//
//        System.out.print("Ust limit girin :");
//        int ust = input.nextInt();
//
//        for (int i = alt; i < ust; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        boolean isPrime = true;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int num = input.nextInt();
        if (num < 2) {
            isPrime = false;
        }

        for (int i = 2; i < num/2; i++) {
            count++;
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Asaldir");
            System.out.println("Count: " + count);
        }else {
            System.out.println("Asal degildir");
            System.out.println("Count: " + count);
        }




    }
}
