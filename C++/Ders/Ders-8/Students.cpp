//
// Created by jabru on 8/29/2022.
//

#include "Students.h"

Students::Students(const std::string &name, int number) : name(name), number(number) {}

Students::~Students() {

}

std::ostream &operator<<(std::ostream &os, const Students &students) {
    os << "name: " << students.name << " number: " << students.number;
    return os;
}

const std::string &Students::getName() const {
    return name;
}

int Students::getNumber() const {
    return number;
}
