#include "Person.h"

// Parameterized Construcotr
Person::Person(std::string name, std::string surname, int age) {
	this->name = name;
	this->surname = surname;
	this->age = age;
}

// Default Constructor
Person::Person() {
	this->age = 0;
	this->name = "UNDEFINED";
	this->surname = "UNDEFINED";
}
 
// Copy Constructor
Person::Person(Person &obj) {
	this->name = obj.name;
	this->surname = obj.surname;
	this->age = obj.age;
}

void Person::print() {
	std::cout << "Name: " << this->name
		<< "\nSurname: " << this->surname
		<< "\nAge: " << this->age << "\n" << std::endl;
}