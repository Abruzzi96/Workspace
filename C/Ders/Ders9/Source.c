#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#pragma warning (disable:4996)

//struct Person{
//	char name[50];
//	int citNo;
//	float salary;
//};

int main() {
	/*
			C Program to Find the Frequency of Characters in a String\0 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

			e


	*/

	/*char str[50];
	printf("Enter a string : ");
	fgets(str, sizeof(str), stdin);

	char alf;
	printf("Enter a character : ");
	scanf_s("%c", &alf);

	int count = 0;
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] == 'e') {
			count++;
		}
	}
	printf("%c karakteri %d tekrar eder", alf, count);*/

	//int lenght = 0;
	//char str[20];
	//fgets(str, sizeof(str), stdin);
	///*for (int i = 0; str[i] != '\n'; i++) {
	//	lenght++;
	//}*/

	//printf("%d", strlen(str)-1);

	//char line[255];

	//printf("Enter a string: ");
	//fgets(line, sizeof(line), stdin);

	//for (int i = 0, j; i < line[i] != '\0'; ++i) {
	//	while (!(line[i] >= 'a' && line[i] <= 'z') && !(line[i] >= 'A' && line[i] <= 'Z') && !(line[i] == '\0')) {
	//		for (j = i; line[j] != '\0'; ++j) {
	//			line[j] = line[j + 1]; // fasd\0\0\0\0\0\0\0
	//		}
	//		line[j] = '\0';
	//	}
	//}

	//printf("Output String: ");
	//puts(line);

	// [Mert, Ayberk, Mustafa, Koray, Ahmet] 
	// 

	/*char str[5][50], temp[50];

	for (int i = 0; i < 5; i++) {
		fgets(str[i], sizeof(str), stdin);
	}

	for (int i = 0; i < 5; i++) {
		for (int j = i + 1; j < 5; j++) {
		
			if (strcmp(str[i], str[j]) > 0) {
				strcpy(temp, str[i]);
				strcpy(str[i], str[j]);
				strcpy(str[j], temp);
			}
		}
	}

	printf("Sorted Array: ");

	for (int i = 0; i < 5; i++) {
		fputs(str[i], stdout);
	}*/

	//int x = 5;
	//struct Person myPerson;
	//myPerson.salary = 4000;

	//printf("%f", myPerson.salary);

	return 0;
}