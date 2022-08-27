#include <iostream>
#include <stdbool.h>
#include <stdlib.h>

using namespace std;

void greet();
void duble(int num);
int add(int a, int b);
void menu();

struct student {
    string name;
    int ID;
};





int main()
{
    /*int NUM;
    cout << "Enter a number: ";
    cin >> NUM;

    cout << "The number is: " << NUM << endl;*/

    /*
    
    Operator	Operation
        +	Addition
        -	Subtraction
        *	Multiplication
        /	Division
        %	Modulo Operation (Remainder after division)
    



    Operator	Example	Equivalent to
        =	    a = b;	    a = b;
        +=	    a += b; 	a = a + b;
        -=	    a -= b; 	a = a - b;
        *=	    a *= b; 	a = a * b;
        /=	    a /= b; 	a = a / b;
        %=	    a %= b; 	a = a % b;




    Operator	Meaning	                            Example
        ==	        Is Equal To	                    3 == 5 gives us false
        !=	        Not Equal To	                3 != 5 gives us true
        >	        Greater Than	                3 > 5 gives us false
        <	        Less Than	                    3 < 5 gives us true
        >=	        Greater Than or Equal To	    3 >= 5 give us false
        <=	        Less Than or Equal To	        3 <= 5 gives us true








    Operator	            Example                                 	Meaning
    &&	            expression1 && expression2	                    Logical AND. True only if all the operands are true.
    ||	         expression1 || expression2	                        Logical OR TruE if at least one of the operands is true.
    !	                !expression	                                Logical NOT. True only if the operand is false.




    Operator	                    Description	                                                        Example
    sizeof	            returns the size of data type	                                    sizeof(int); // 4
    ?: 	                returns value based on the condition	                            string result = (5 > 0) ? "even" : "odd"; // "even"
    &	                represents memory address of the operand	                        &num; // address of num
    .	                accesses members of struct variables or class objects	            s1.marks = 92;
    ->	                used with pointers to access the class or struct variables	        ptr->marks = 92;
    <<	                prints the output value	                                            cout << 5;
    >>	                gets the input value	                                            cin >> num;




    */

    /*int num;
    cout << "bir sayi gir : ";
    cin >> num;
    if (num > 0)
        cout << "number is positive";
    else if (num < 0)
        cout << "number is negative";
    else {
        cout << "its zero!";
    }*/

   /* int num;
    cout << "num ?";
    cin >> num;

    switch (num)
    { 
        case 1:
            cout << "bir" << endl;
            break;
        case 2:
            cout << "iki" << endl;
            break;
        case 3:
            cout << "uc" << endl;
            break;
        default:
            break;
    }*/

    
   /* for (int i = 0; i <= 20; i++) {
        if (i % 2 == 0)
            cout << i;
    }*/

        /*int num;
        cout << "Num: ";
        cin >> num;
        
        bool isPrime = true;
        
        if (num == 1)
        isPrime = false;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime == true) {
            cout << "asaldir";
        }
        else {
            cout << "asal degildir";
        }*/
    
    /*int num;
    int toplam = 0;

    while (true)
    {
        cout << "num :";
        cin >> num;

        if (num > 0) {
            toplam += num;
        }
        else {
            break;
        }
    }
    cout << toplam;*/

    //greet();
    
    //int num;
    //cout << "Num :";
    //cin >> num;
    //duble(num);

    //menu();

    //cout << add(5, 7) << endl;

    //int marks[5];

    //for (int i = 0; i < 5; i++) {
    //    cout << "Enter Number: ";
    //    cin >> marks[i];

    //    cout << "Entered Number: " << marks[i] << endl;
    //}

    /*int x[2][2];
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cin >> x[i][j];
        }
    }
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << x[i][j];
        }
    }*/

 /*   X Y
    Z Q*/


    //struct student x;
    //x.name = "Ayberk";
    //x.ID = 10;

    //cout << x.name << endl;
    
    
    return 0;
}

//int add(int a, int b) {
//    return a + b ;
//}

/*
    returnType functionName (param1, param2, param3..){
        //function body;
    }
*/
//
//void greet() {
//    cout << "Hello!" << endl;
//}
//
//void duble(int num) {
//    cout << num * 2;
//}
//
//void add() {
//    int num1;
//    int num2;
//    cout << "First num :";
//    cin >> num1;
//    cout << "Sec num :";
//    cin >> num2;
//    cout << num1 + num2;
//    
//}
//void substruct() {
//    int num1;
//    int num2;
//    cout << "First num :";
//    cin >> num1;
//    cout << "Sec num :";
//    cin >> num2;
//    cout << num1 - num2;
//}
//void divide() {
//    int num1;
//    int num2;
//    cout << "First num :";
//    cin >> num1;
//    cout << "Sec num :";
//    cin >> num2;
//    if (num2 == 0) {
//        cout << "Error!";
//        return;
//    }
//    cout << num1 / (float)num2;
//}
//void multiply() {
//    int num1;
//    int num2;
//    cout << "First num :";
//    cin >> num1;
//    cout << "Sec num :";
//    cin >> num2;
//    cout << num1 * num2;
//}
//
//void menu() {
//    cout << "1 toplama" << endl;
//    cout << "2 cikarma" << endl;
//    cout << "3 bolme" << endl;
//    cout << "4 carpma" << endl;
//    cout << "secim :";
//    int op;
//    cin >> op;
//    switch (op)
//    {
//    case 1:
//        system("cls");
//        cout << "===========TOPLAMA==========="<<endl;
//        add();
//        break;
//    case 2:
//        system("cls");
//        cout << "===========ÇIKARMA===========" << endl;
//        substruct();
//        break;
//    case 3:
//        system("cls");
//        cout << "===========BÖLME===========" << endl;
//        divide();
//        break;
//    case 4:
//        system("cls");
//        cout << "===========ÇARPMA===========" << endl;
//        multiply();
//        break;
//    default:
//        break;
//    }
//}