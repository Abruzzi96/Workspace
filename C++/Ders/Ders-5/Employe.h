//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_5_EMPLOYE_H
#define DERS_5_EMPLOYE_H
#include <iostream>

class Employe {
private:
    std::string name;
    std::string surname;
    int age;
public:
    Employe(const std::string &name, const std::string &surname, int age);

    Employe();

    const std::string &getName() const;

    friend std::ostream &operator<<(std::ostream &os, const Employe &employe);

    void setName(const std::string &name);

    const std::string &getSurname() const;

    void setSurname(const std::string &surname);

    int getAge() const;

    void setAge(int age);
};


#endif //DERS_5_EMPLOYE_H
