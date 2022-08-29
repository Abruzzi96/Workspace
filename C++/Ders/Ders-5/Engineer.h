//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_5_ENGINEER_H
#define DERS_5_ENGINEER_H


#include <iostream>
#include "Employe.h"

class Engineer : public Employe {
private:
    std::string department;
public:
    Engineer(const std::string &name, const std::string &surname, int age, const std::string &department);

    friend std::ostream &operator<<(std::ostream &os, const Engineer &engineer);

    const std::string &getDepartment() const;

    void setDepartment(const std::string &department);
};


#endif //DERS_5_ENGINEER_H
