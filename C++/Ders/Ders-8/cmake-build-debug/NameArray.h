//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_8_NAMEARRAY_H
#define DERS_8_NAMEARRAY_H
#include <iostream>
#include "list"
#include "Students.h"
class NameArray {
private:
    std::list<Students> studentList;
    int size;
public:
    NameArray();

    void insert(std::string name, int number);
    void delStudent(std::string name);
    bool contains(std::string name);
};


#endif //DERS_8_NAMEARRAY_H
