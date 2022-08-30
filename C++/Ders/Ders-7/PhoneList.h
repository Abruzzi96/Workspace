//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_7_PHONELIST_H
#define DERS_7_PHONELIST_H
#include "Entry.h"
#include <list>

class PhoneList {
private:
    std::list<Entry> entries;
    int size;
public:
    PhoneList();

    int getSize() const;

    virtual ~PhoneList();

    void insert(std::string name, int phoneNum);

    int getNumber(std::string name);
};


#endif //DERS_7_PHONELIST_H
