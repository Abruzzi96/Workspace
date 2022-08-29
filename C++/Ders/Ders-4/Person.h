//
// Created by jabru on 8/29/2022.
//

#ifndef UNTITLED_PERSON_H
#define UNTITLED_PERSON_H
#include <iostream>

using namespace std;
class Person {
private:
    std::string name;
    std::string surname;
    int age;
public:
    Person(string name, string surname, int age);

    Person();

    const string &getName() const;

    void setName(const string &name);

    const string &getSurname() const;

    void setSurname(const string &surname);

    int getAge() const;

    void setAge(int age);

    friend ostream &operator<<(ostream &os, const Person &person);
};


#endif //UNTITLED_PERSON_H
