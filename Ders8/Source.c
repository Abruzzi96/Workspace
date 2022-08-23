#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#pragma warning (disable:4996)


void displayName(char name[]) {
	printf("Hello %s", name);
}

int main() {
	///*int howMany = 0;
	//printf("Enter the number of elements : ");
	//scanf_s("%d", &howMany);

	//double* ptr = (double*) malloc(howMany * sizeof(double));
	//
	//if (ptr == NULL) {
	//	printf("Failed");
	//	exit(0);
	//}
	//else {
	//	printf("Successfully allocated!\n\n");
	//}

	//for (int i = 0; i < howMany; i++) {
	//	printf("Enter number %d : ", i);
	//	scanf_s("%lf", ptr + i);
	//}
	//double sum = 0;
	//for (int i = 0; i < howMany; i++) {
	//	sum += *(ptr + i);
	//}

	//printf("%lf", sum / howMany);*/

	//char name1[7] = "Ayberk";
	//char name2[10];

	//
	//char name[20];
	//printf("Enter your name: ");
	////scanf("%s", name);
	//fgets(name, sizeof(name), stdin);
	//printf("Your name is %s", name); //gcc xcode 

	///*displayName("Mert");*/

	//char name[] = "Harry Potter";

	//printf("%c", *name); //
	//printf("%c", *(name+1)); //
	//printf("%c", *(name+2)); //

	///*for (int i = 0; i < (sizeof(name) / sizeof(char)); i++) {
	//	printf("%c", name[i]);
	//}*/

	///*for (int i = 0; i < (sizeof(name) / sizeof(char)); i++) {
	//	printf("%c", *(name + i));
	//}*/

	//int i = 0;

	//while (*(name + i) != '\0') {
	//	printf("%c", *(name + i));
	//	i++;
	//}

	//printf("Length = %d", strlen("Ayberk Mert Ali Okan"));

	//char name[20];
	//strcpy(name, "Ayberk");
	//puts(name);

	//char name[20] = "Harry ";
	//strcat(name, "Potter");
	//puts(name);

	//printf("%d", strcmp("Ayberk", "Ayberk"));
	//printf("%d", strcmp("Ayberk", "Byberk"));
	//printf("%d", strcmp("Byberk", "Ayberk"));


	printf("\n\n");
	return 0;
}