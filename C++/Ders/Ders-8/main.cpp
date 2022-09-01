#include <iostream>
#include "NameArray.h"

using namespace std;
int main() {
    NameArray storage1 = *new NameArray();
    cout<<storage1.contains("Ali")<<endl;

    storage1.insert("Mehmet",5);
    storage1.insert("Ayberk",20);
    storage1.insert("Mert",25);

    cout<<storage1.contains("Mert")<<endl;

    return 0;
}

