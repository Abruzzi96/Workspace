#include "Student.h"

Student::Student(std::string name, std::string surname, int age, int ID) {
	this->name = name;
	this->surname = surname;
	this->age = age;
	this->ID = ID;
	
}
void Student::print() {
	std::cout << "Name: " << this->name
		<< "\nSurname: " << this->surname 
		<< "\nID: " << this->ID << "\nAge: " 
		<< this->age << std::endl;
}
