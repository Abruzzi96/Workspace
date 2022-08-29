#ifndef STUDENT_H
#define STUDENT_H
#include <iostream>

class Student
{
	private:
		std::string name;
		std::string surname;
	protected:
		int age;
	public:
		int ID;
		Student(std::string name, std::string surname, int age, int ID);
		void print();
};

#endif