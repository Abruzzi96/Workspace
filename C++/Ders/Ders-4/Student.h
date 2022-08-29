//
// Created by jabru on 8/29/2022.
//

#ifndef UNTITLED_STUDENT_H
#define UNTITLED_STUDENT_H

#include <ostream>
#include "Person.h"

class Student : public Person{
private:
    std::string department;
public:
    Student(const string &name, const string &surname, int age, string department);

    const string &getDepartment() const;

    void setDepartment(const string &department);

    friend ostream &operator<<(ostream &os, const Student &student);
};


#endif //UNTITLED_STUDENT_H
