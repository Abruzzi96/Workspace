#include "Time.h"
#include <iostream>
#include <iomanip>

using namespace std;

// Time::Time(const int h, const int m, const int s) : hour(h), min(m), sec(s){}

Time::Time(const int h, const int m, const int s) {
	this->hour = h;
	this->min = m;
	this->sec = s;
}

void Time::setTime(const int h, const int m, const int s) {
	this->hour = h;
	this->min = m;
	this->sec = s;
}

void Time::print() const {
	cout << setw(2) << setfill('0') << hour << ":"
		<< setw(2) << setfill('0') << min << ":"
		<< setw(2) << setfill('0') << sec << endl;
}

bool Time::equals(const Time& otherTime) {
	if (this->hour == otherTime.hour
		&& this->min == otherTime.min
		&& this->sec == otherTime.sec)
		return true;
	else
		return false;
}