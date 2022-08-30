//
// Created by jabru on 8/29/2022.
//

#include "Calculator.h"
#include <iostream>

using namespace std;

void Calculator::subtract(int n1, int n2) {
    cout << n1 - n2 << endl;
}

void Calculator::divide(int n1, int n2) {
    cout << n1 / n2 << endl;
}

void Calculator::multiply(int n1, int n2) {
    cout << n1 * n2 << endl;
}

void Calculator::mod(int n1, int n2) {
    cout << n1 % n2 << endl;
}

void Calculator::add(int n1, int n2) {
    cout << n1 + n2 << endl;
}
