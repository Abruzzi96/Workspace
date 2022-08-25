#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#pragma warning (disable:4996)

//union Person
//{
//	char name[50];
//	int citNo;
//	float salary;
//};
//
//struct Complex {
//	int imag;
//	float real;
//};
//
//struct number {
//	struct Complex comp;
//	int integers;
//}x;
//
//struct person {
//	int age;
//	float weight;
//};

//void displayAllPersons(int numOfPersons, struct Person* ptr) {
//	for (int i = 0; i < numOfPersons; i++) {
//		printf("Name: %s\nCitNo: %d\nSalary: %f\n\n", (ptr + i)->name, (ptr + i)->citNo, (ptr + i)->salary);
//	}
//}

//void fillPerson(int numOfPersons, struct Person* ptr) {
//
//	for (int i = 0; i < numOfPersons; i++) {
//		printf("Person-%d:\n", i);
//
//		printf("Name: ");
//		scanf("%s", (ptr + i)->name);
//
//		printf("CitNo: ");
//		scanf("%d", &(ptr + i)->citNo);
//
//		printf("Salary: ");
//		scanf("%f", &(ptr + i)->salary);
//
//		printf("\n");
//	}
//}

//struct distance {
//	int feet;
//	int inch;
//};
//
//struct time {
//	int hour;
//	int minute;
//	int second;
//};
//
//struct course {
//	int courseMark;
//	char courseName[10];
//};

//void displayStudent(int studentInfo, struct course* ptr) {
//	for (int i = 0; i < studentInfo; i++) {
//		printf("Credit : %s\nCourses: %d\nMarks: %f\n\n", (ptr + i)->records, (ptr + i)->courseName, (ptr + i)->courseMark);
//	}
//}
//
//void fillStudent(int studentInfo, struct course* ptr) {
//
//	for (int i = 0; i < studentInfo; i++) {
//		printf("Student-%d:\n", i);
//
//		printf("Course Name: ");
//		scanf("%c", &(ptr + i)->courseName);
//
//		printf("Grade: ");
//		scanf("%d", &(ptr + i)->courseMark);
//
//		printf("\n");
//	}
//}

struct student {
	int age;
	int grade;
};

int main() {

	// #########################

	// x.comp.real

	/*person person1;
	strcpy(person1.name, "George Orwell");
	person1.citNo = 1984;
	person1.salary = 2500;

	// #########################################

	printf("Name: %s\n", person1.name);
	printf("CitNo: %d\n", person1.citNo);
	printf("Salary: %f\n", person1.salary);*/

	/*
	
	// ###########################
	struct person* personPtr;
	struct person person;

	// ###########################

	personPtr = &person;

	printf("Enter age: ");
	scanf("%d", &personPtr->age);

	printf("Enter weight: ");
	scanf("%f", &personPtr->weight);

	printf("Displaying: \n");
	printf("Age: %d\n", personPtr->age);
	printf("Weight: %f\n", personPtr->weight);*/

	/*int numOfPersons;
	printf("Enter the number of persons: ");
	scanf("%d", &numOfPersons);

	struct Person* ptr = (struct Person*)malloc(numOfPersons * sizeof(struct Person));
	
	fillPerson(numOfPersons, ptr);

	printf("Displaying All Persons:\n");

	displayAllPersons(numOfPersons, ptr);*/

	// 12 inch -> 1 feet

	//struct distance d1, d2;

	//printf("Birinci distance gir : ");
	//scanf("%d %d", &d1.feet, &d1.inch);
	//printf("Ýkinci distance gir : ");
	//scanf("%d %d", &d2.feet, &d2.inch);

	//struct distance d3;
	//d3.feet = d1.feet + d2.feet;
	//d3.inch = d1.inch + d2.inch; //13254 
	//d3.feet += d3.inch / 12;
	//d3.inch = d3.inch % 12;
	//printf("%d %d", d3.feet, d3.inch);
	
	//struct time t1, t2;				// (08:52AM - 07:34PM)
	//t1.hour = 13;
	//t1.minute = 34;
	//t1.second = 55;

	//t2.hour = 8;
	//t2.minute = 12;
	//t2.second = 15;

	//int t1sec = t1.second + t1.minute * 60 + t1.hour * 3600;
	//int t2sec = t2.second + t2.minute * 60 + t2.hour * 3600;

	//int diff = t1sec - t2sec;

	//struct time differance;
	//differance.hour = diff / 3600;
	//diff %= 3600;

	//differance.minute = diff / 60;
	//diff %= 60;

	//differance.second = diff;
	/*
										ASSIGNMENT

			Create "course" structure that has courseName and courseMark.

			In this example, you will learn to store the information entered by the user using dynamic memory allocation.
			This program asks the user to store the value of noOfRecords and allocates the memory for the noOfRecords structure 
			variables dynamically using the malloc() function.

			Output

			Enter the number of records: 2
			Enter subject and marks:
			Science 82
			Enter subject and marks:
			DSA 73
			
			Displaying Information:
			Science     82
			DSA     73	
	*/

	/*int courseNumber;

	printf("How many lessons: ");
	scanf("%d", &courseNumber);

	struct course* ptr = (struct course*) malloc(courseNumber * sizeof(struct course));
 
	if (ptr == NULL) {
		printf("Memory not allocated.\n");
		exit(0);
	}
	else {
		printf("Memory successfully allocated using malloc.\n");
	}

	for (int i = 0; i < courseNumber; i++) {
		printf("Course Name: ");
		scanf("%s", (ptr+i)->courseName);
		printf("Grade: ");
		scanf("%d", &(ptr + i)->courseMark);
	}

	for (int i = 0; i < courseNumber; i++) {
		printf("Course-%d\n\n", i);
		printf("Course Name: %s\n", (ptr + i)->courseName);
		printf("Grade: %d\n\n", (ptr + i)->courseMark);
	}
	free(ptr);	*/

	/*int num;
	FILE* fptr = fopen("C:\\Users\\jabru\\Desktop\\Workspace\\Ders10\\program.txt", "w");

	if (fptr == NULL) {
		printf("Error!");
		exit(1);
	}

	printf("Enter number: ");
	scanf("%d", &num);

	fprintf(fptr, "%d", num);
	fclose(fptr);*/

	/*int num;
	FILE* fptr;

	if ((fptr = fopen("C:\\Users\\jabru\\Desktop\\Workspace\\Ders10\\program.txt", "r")) == NULL) {
		printf("Error!");
		exit(1);
	}

	fscanf(fptr, "%d", &num);
	printf("Value of num = %d", num);
	fclose(fptr);*/

	//struct student student1;
	//FILE* fptr;

	//if ((fptr = fopen("C:\\Users\\jabru\\Desktop\\Workspace\\Ders10\\program.bin", "wb")) == NULL) {
	//	printf("Error!");
	//	exit(1);
	//}

	//for (int i = 0; i < 3; i++) {
	//	student1.age = i;
	//	student1.grade = i;

	//	fwrite(&student1, sizeof(struct student), 1, fptr);
	// ############################################ 1 ne iþ ?
	//}

	//fclose(fptr);


	struct student student1;
	FILE* fptr;
	
	if ((fptr = fopen("C:\\Users\\jabru\\Desktop\\Workspace\\Ders10\\program.bin", "rb")) == NULL) {
		printf("Error!");
		exit(1);
	}
	
	
	for (int i = 0; i < 3; i++) {
		fread(&student1, sizeof(struct student), 1, fptr);
		printf("Age: %d\nGrade: %d\n\n", student1.age, student1.grade);
	}

	fclose(fptr);
	
	return 0;	
}