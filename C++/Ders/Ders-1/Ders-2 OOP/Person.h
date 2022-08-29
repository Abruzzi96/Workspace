#ifndef PERSON_H
#define PERSON_H
#include <iostream>
class Person
{
	private:
		std::string name; //null
		std::string surname; //null
		int age; //0
	public:
		//Default Constructor
		Person();

		//Parameterized Constructor
		Person(std::string name, std::string surname, int age);

		//Copy Constructor
		Person(Person& obj);

		void print();
};

#endif