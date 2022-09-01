//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_8_STUDENTS_H
#define DERS_8_STUDENTS_H
#include <iostream>

class Students {
private:
    std::string name;
    int number;
public:
    Students(const std::string &name, int number);

    virtual ~Students();

    friend std::ostream &operator<<(std::ostream &os, const Students &students);

    const std::string &getName() const;

    int getNumber() const;
};


#endif //DERS_8_STUDENTS_H
