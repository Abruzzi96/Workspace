//
// Created by jabru on 8/29/2022.
//

#include "Student.h"

#include <utility>

Student::Student(const string &name, const string &surname, int age, string department) : Person(name, surname,
                                                                                                        age),
                                                                                                 department(std::move(
                                                                                                         department)) {}

const string &Student::getDepartment() const {
    return department;
}

void Student::setDepartment(const string &department) {
    Student::department = department;
}

ostream &operator<<(ostream &os, const Student &student) {
    os << static_cast<const Person &>(student) << "\ndepartment: " << student.department;
    return os;
}
