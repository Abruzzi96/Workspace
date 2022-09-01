//
// Created by jabru on 8/29/2022.
//

#include "NameArray.h"

NameArray::NameArray() {
    this->size = 0;
}

bool NameArray::contains(const std::string& name) {
    for (const Students& currentStudent : this->studentList){
        if(name == currentStudent.getName()){
            return true;
        }
    }
    return false;
}

void NameArray::delStudent(std::string name) {
    for (const Students& currentStudent : this->studentList ) {
        if (name == currentStudent.getName()){
            this->studentList.remove(currentStudent);
        }
    }
}

void NameArray::insert(std::string name, int number) {
    // push_back
}
