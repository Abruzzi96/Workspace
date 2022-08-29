#include <iostream>
#include "Person.h"
#include "Student.h"
#include <vector>

using namespace std;

int main()
{
	//Person *p1 = new Person();
	//Person *p2 = new Person("Mert", "Tatar", 20);
	//Person *p3 = new Person(*p2);

	///*Person persons[3];
	//persons[0] = *p1;
	//persons[1] = p2;
	//persons[2] = p3;

	//for (int i = 0; i < 3; i++) {
	//	cout << persons[i] << endl;
	//}*/

	//vector<Person*> personList = *new vector<Person*>();
	//personList.push_back(p1);
	//personList.push_back(p2);
	//personList.push_back(p3);

	//// delete function?

	
	Student s1 = *new Student("Ayberk", "Saygi", 20, "ASD");
	cout << s1 << endl;
}
