#ifndef STUDENT_H
#define STUDENT_H

#include "Person.h"

class Student : public Person
{
	private:
		std::string department;
	public:
		Student();
		Student(std::string name, std::string surname, int age, std::string department);

		std::string getDepartment();
		void setDepartment(std::string department);
		friend std::ostream& operator<< (std::ostream& output, const Student& obj);
};

#endif