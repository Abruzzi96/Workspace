//
// Created by jabru on 8/29/2022.
//

#include "Employe.h"

const std::string &Employe::getName() const {
    return name;
}

void Employe::setName(const std::string &name) {
    Employe::name = name;
}

const std::string &Employe::getSurname() const {
    return surname;
}

void Employe::setSurname(const std::string &surname) {
    Employe::surname = surname;
}

int Employe::getAge() const {
    return age;
}

void Employe::setAge(int age) {
    Employe::age = age;
}

Employe::Employe(const std::string &name, const std::string &surname, int age) : name(name), surname(surname),
                                                                                 age(age) {}

Employe::Employe() {}

std::ostream &operator<<(std::ostream &os, const Employe &employe) {
    os << "name: " << employe.name << "\nsurname: " << employe.surname << "\nage: " << employe.age<< "\n";
    return os;
}
