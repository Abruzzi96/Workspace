//
// Created by jabru on 8/29/2022.
//

#include "PhoneList.h"


PhoneList::PhoneList() {
    this->size = 0;
}

PhoneList::~PhoneList() {

}

int PhoneList::getSize() const {
    return size;
}

void PhoneList::insert(std::string name, int phoneNum) {
    Entry entry = *new Entry(name,phoneNum);
    this->entries.push_back(entry);
    this->size++;
}

int PhoneList::getNumber(std::string name) {
    for (const Entry& entry : this->entries){
        if(entry.getName() == name){
            return entry.getNumber();
        }
    }
    return -1;
}
