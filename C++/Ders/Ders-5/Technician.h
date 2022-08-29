//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_5_TECHNICIAN_H
#define DERS_5_TECHNICIAN_H


#include <ostream>
#include "Employe.h"

class Technician: public Employe {
private:
    int experience;
public:
    Technician(const std::string &name, const std::string &surname, int age, int experience);

    int getExperience() const;

    friend std::ostream &operator<<(std::ostream &os, const Technician &technician);

    void setExperience(int experience);

    bool operator<(const Technician &rhs) const;

    bool operator>(const Technician &rhs) const;

    bool operator<=(const Technician &rhs) const;

    bool operator>=(const Technician &rhs) const;

    bool operator==(const Technician &rhs) const;

    bool operator!=(const Technician &rhs) const;

};


#endif //DERS_5_TECHNICIAN_H
