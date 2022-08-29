//
// Created by jabru on 8/29/2022.
//

#include "Technician.h"

Technician::Technician(const std::string &name, const std::string &surname, int age, int experience) : Employe(name,
                                                                                                               surname,
                                                                                                               age),
                                                                                                       experience(
                                                                                                               experience) {}

int Technician::getExperience() const {
    return experience;
}

void Technician::setExperience(int experience) {
    Technician::experience = experience;
}

std::ostream &operator<<(std::ostream &os, const Technician &technician) {
    os << static_cast<const Employe &>(technician) << "experience: " << technician.experience<< "\n";
    return os;
}

bool Technician::operator<(const Technician &rhs) const {
    return experience < rhs.experience;
}

bool Technician::operator>(const Technician &rhs) const {
    return experience > rhs.experience;
}

bool Technician::operator<=(const Technician &rhs) const {
    return experience <= rhs.experience;
}

bool Technician::operator>=(const Technician &rhs) const {
    return experience >= rhs.experience;
}

bool Technician::operator==(const Technician &rhs) const {
    return experience == rhs.experience;
}

bool Technician::operator!=(const Technician &rhs) const {
    return !(rhs == *this);
}