//
// Created by jabru on 8/29/2022.
//

#include "Entry.h"

Entry::Entry(const std::string &name, int number) : name(name), number(number) {}

Entry::~Entry() {

}

const std::string &Entry::getName() const {
    return name;
}

void Entry::setName(const std::string &name) {
    Entry::name = name;
}

int Entry::getNumber() const {
    return number;
}

void Entry::setNumber(int number) {
    Entry::number = number;
}
