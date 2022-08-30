//
// Created by jabru on 8/29/2022.
//

#ifndef DERS_7_ENTRY_H
#define DERS_7_ENTRY_H
#include <iostream>

class Entry {
private:
    std::string name;
    int number;
public:
    const std::string &getName() const;

    void setName(const std::string &name);

    int getNumber() const;

    void setNumber(int number);

    virtual ~Entry();

    Entry(const std::string &name, int number);
};


#endif //DERS_7_ENTRY_H
