#ifndef PERSON_H
#define PERSON_H
#include <iostream>

class Person
{
	private:
		std::string name;
		std::string surname;
		int age;
	public:
		Person();
		Person(std::string name, std::string surname, int age);
		Person(Person& obj);

		std::string getName();
		std::string getSurname();
		int getAge();

		void setName(std::string name);
		void setSurname(std::string surname);
		void setAge(int age);

		friend std::ostream& operator<< (std::ostream& output, const Person& obj);
};

#endif