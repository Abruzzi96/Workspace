#include "Person.h"

Person::Person() {
	this->name = "Default";
	this->surname = "Default";
	this->age = 0;
}

Person::Person(std::string name, std::string surname, int age) {
	this->name = name;
	this->surname = surname;
	this->age = age;
}

Person::Person(Person& obj) {
	this->name = obj.name;
	this->surname = obj.surname;
	this->age = obj.age;
}

std::string Person::getName() {
	return this->name;
}

std::string Person::getSurname() {
	return this->surname;
}

int Person::getAge() {
	return this->age; 
}

void Person::setName(std::string name) {
	this->name = name;
}

void Person::setSurname(std::string surname) {
	this->surname = surname;
}

void Person::setAge(int age) {
	this->age = age;
}

std::ostream& operator<< (std::ostream& output, const Person& obj) {
	output << "Name: " << obj.name << "\nSurname: " << obj.surname << "\nAge: " << obj.age << "\n";
	return output;
}