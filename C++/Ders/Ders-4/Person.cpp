//
// Created by jabru on 8/29/2022.
//

#include "Person.h"

#include <utility>

Person::Person(string name, string surname, int age) : name(std::move(name)), surname(std::move(surname)), age(age) {}

Person::Person() {}

const string &Person::getName() const {
    return name;
}

void Person::setName(const string &name) {
    Person::name = name;
}

const string &Person::getSurname() const {
    return surname;
}

void Person::setSurname(const string &surname) {
    Person::surname = surname;
}

int Person::getAge() const {
    return age;
}

void Person::setAge(int age) {
    Person::age = age;
}

ostream &operator<<(ostream &os, const Person &person) {
    os << "name: " << person.name << "\nsurname: " << person.surname << "\nage: " << person.age;
    return os;
}
