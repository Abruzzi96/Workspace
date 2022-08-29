#include <iostream>
#include "Time.h"
#include "Student.h"
#include "Person.h"

using namespace std;

//class Count {
//private:
//    int value;
//public:
//    Count() : value(5){}
//
//    void operator ++() {
//        value += 3;
//    }
//
//    void display() {
//        cout << "Count: " << value << endl;
//    }
//
//    friend ostream& operator<<(ostream& output, const Count& c) {
//        output << "Value: " << c.value << endl;
//        return output;
//    }
//};


//Base Class / Super Class
//class Animal {
//public:
//    void eat() {
//        cout << "I can eat!" << endl;
//    }
//
//    void sleep() {
//        cout << "I can sleep!" << endl;
//    }
//};+

//class Dog : public Animal {
//public:
//    void bark() {
//        cout << "Woff" << endl;
//    }
//};
//
//class Animal {
//private:
//    string color;
//protected:
//    string type;
//public:
//    void eat() {
//        cout << "I can eat" << endl;
//    }
//
//    void sleep() {
//        cout << "I can sleep!" << endl;
//    }
//
//    void setColor(string clr) {
//        this->color = clr;
//    }
//
//    string getColor() {
//        return this->color;
//    }
//};
//
//
//class Dog : public Animal {
//public:
//    void setType(string tp) {
//        type = tp;
//    }
//
//    void displayInfo() {
//        cout << "I'm a " << type << endl;
//        cout << "My color is " << this->getColor() << endl;
//    }
//
//    void bark() {
//        cout << "I can bark!" << endl;
//    }
//};
//
//
//class Base {
//public: 
//    int x;
//protected:
//    int y;
//private :
//    int z;
//};
//
//class PublicDerived : public Base {
//    // x is public 
//    // y is protected
//};
//
//class ProtectedDerived : protected Base {
//    // x is protected
//    // y is protected
//};
//
//class PrivateDerived : private Base {
//    // x is private
//    // y is private
//};

//class Base {
//public:
//    void print() {
//        cout << "Base Function" << endl;
//    }
//};
//
//class Derived : public Base {
//public:
//    void print() {
//        cout << "Derived Function" << endl;
//    }
//};

int main()
{
    /*Time t1(10, 50, 59);
    t1.print();

    Time t2;
    t2.print();
    t2.setTime(6, 39, 9);
    t2.print();

    if (t1.equals(t2)) {
        cout << "Two objects are equal!" << endl;
    }
    else {
        cout << "Two objects are not equal!" << endl;
    }*/

    //----------------------------------------------------------------------------------

    /*Student s1("Mert", "Tatar", 20, 1);
    Student s2("Ayberk", "Saygi", 20, 2);

    s1.print();
    s2.print();*/

    //----------------------------------------------------------------------------------

    ////Default Constructor
    //Person p1 = *new Person();
    //p1.print();

    ////Parameterized Constructor
    //Person p2 = *new Person("Mert", "Tatar", 20);
    //p2.print();

    ////Copy Constructor
    //Person p3 = *new Person(p2);
    //p3.print();

    /*Person personList[3];

    for (int i = 0; i < 3; i++) {
        cout << "Person-" << i << endl;
        string name;
        string surname; 
        int age;

        cout << "Name: ";
        cin >> name;

        cout << "Second Name: ";
        cin >> surname;

        cout << "Age: ";
        cin >> age;

        personList[i] = *new Person(name, surname, age);
        cout << endl;
    }

    personList[0].print();
    personList[1].print();
    personList[2].print();*/

    //Count count1;
    //count1.display();
    //++count1;
    //count1.display();

    //cout << count1 << endl;

    /*Student s1("Ayberk", "Saygý", 22, 1);
    Student s2 = *new Student("Ayberk", "Saygý", 22, 1);
    Student* s3 = new Student("Ayberk", "Saygý", 22, 1);

    s2.print();
    s3->print();*/
   
    //Dog dog1;
    //dog1.sleep(); // super class function
    //dog1.eat(); // super class function
    //dog1.bark(); // derived class function

    /*Dog dog1;

    dog1.setColor("Black");
    dog1.setType("labrador");

    dog1.displayInfo();*/

    /*Derived d1;
    d1.print();

    Base b1;
    b1.print()*/

}