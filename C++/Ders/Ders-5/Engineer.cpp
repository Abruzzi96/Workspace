//
// Created by jabru on 8/29/2022.
//

#include "Engineer.h"


Engineer::Engineer(const std::string &name, const std::string &surname, int age, const std::string &department)
        : Employe(name, surname, age), department(department) {}

const std::string &Engineer::getDepartment() const {
    return department;
}

void Engineer::setDepartment(const std::string &department) {
    Engineer::department = department;
}

std::ostream &operator<<(std::ostream &os, const Engineer &engineer) {
    os << static_cast<const Employe &>(engineer) << "department: " << engineer.department << "\n";
    return os;
}
