#include "Student.h"

Student::Student() {
	this->department = "abc";
}

Student::Student(std::string name, std::string surname, int age, std::string department) 
	: department(department), Person(name, surname, age){}

std::string Student::getDepartment() {
	return this->department;
}

void Student::setDepartment(std::string department) {
	this->department = department;
}

std::ostream& operator<< (std::ostream& output, Student& obj) {
	output << "Name: " << obj.getName() << "\nSurname: " << obj.getSurname() << "\nAge: " << obj.getAge() << "\nDepartment: " << obj.getDepartment() << "\n";
	return output;
}