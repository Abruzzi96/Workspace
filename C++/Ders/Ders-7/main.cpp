#include <iostream>
#include "PhoneList.h"
using namespace std;

int main() {
    PhoneList plist = *new PhoneList();

    plist.insert("Ali", 12345);
    plist.insert("Mehmet",28973);

    // printf(“The phone number of Ali is :”, myList[“Ali”]);

    cout << "The phone number of Ali is: "<<plist.getNumber("Ali");

    return 0;
}
