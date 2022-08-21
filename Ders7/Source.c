#include <stdio.h>
#include <stdlib.h>

//void swap(int *a, int *b) {
//	int c = 0;
//	c = *a;
//	*a = *b;
//	*b = c;
//}
//
//void addOne(int* ptr) {
//	(*ptr)++;
//}


int main() {

	//int var = 5;
	//int var2 = 10;
	//printf("Var = %d\n", var); // 5

	//printf("Adress of var = %p\n", &var);

	//int* ptr = &var;
	//ptr = &var2;
	//printf("PTR = %p\n", ptr);

	/*
				& => Adress
				* => Gives content of a pointer

	*/

	//printf("%d", *(&var));

	/*int* pc, c;
	c = 5;
	pc = &c;

	printf("%d", *pc);*/

	//int* pc, c;
	//c = 5;
	//pc = &c;
	//c = 1;

	//printf("%d", c); // 1
	//printf("%d", *pc); // 1

	//int* pc, c;
	//c = 5;
	//pc = &c;
	//*pc = 1;

	//printf("%d", *pc); // 1
	//printf("%d", c); // 1

	//int* pc, c, d;

	//c = 5;
	//d = -15;

	//pc = &c;
	//printf("%d", *pc); // 5

	//pc = &d;
	//printf("%d", *pc); // -15

	//int* pc, c;

	//c = 22;
	//printf("Address of c: %p\n", &c); // 0x16
	//printf("Value of c: %d\n\n", c); // 22

	//pc = &c;
	//printf("Address of pointer pc: %p\n", pc); // 0x16
	//printf("Content of pointer pc: %d\n\n", *pc); // 22

	//c = 11;
	//printf("Address of pointer pc: %p\n", pc); // 0x16
	//printf("Content of pointer pc: %d\n\n", *pc); // 11

	//*pc = 2;
	//printf("Address of c: %p\n", &c); // 0x16
	//printf("Value of c: %d\n\n", c); // 2


	//int c;
	//int* pc;

	//pc = c; //invalid
	//c = pc; //invalid

	//*pc = &c; //invalid

	//pc = &c; //valid
	//*pc = c; //valid

	/*int x[4];

	for (int i = 0; i < 4; i++) {
		printf("&x[%d] = %p\n", i, &x[i]);
	}
	printf("Address of array x: %p", x);*/

	//int x[5], sum = 0;

	//printf("Enter 5 vals!\n");

	//for (int i = 0; i < 5; i++) {
	//	scanf_s("%d", x + i);
	//	sum += *(x + i);
	//}

	//printf("Sum = %d", sum);
	
	/*int x[5] = { 1,2,3,4,5 };
	int* ptr;

	ptr = &x[0];

	for (int i = 0; i < 5; i++) {
		printf("*(ptr+i) = %d\n", *(ptr + i));
	}*/
	
	/*int a = 5;
	int b = 10;

	swap(&a, &b);

	printf("A = %d\n", a);
	printf("B = %d\n", b);*/

	/*int* p, i = 10;
	
	p = &i;
	addOne(p);

	printf("%d", i);*/

	/*
	
		* * * * * * * * * * TTT AAA SSS KKK * * * * * * * * * *

		Ask user to number of elements and then allocate that space from ram using malloc function. Then, fill that space find the acg of
		numbers located in that space.
	
		Malloc
		pointers & malloc
		memory allocation C
	
	*/

	int* ptr;
	int n, i;

	printf("Enter the number of elements : ");
	scanf_s("%d", &n);

	ptr = (int*)malloc(n * sizeof(int));

	if (ptr == NULL) {
		printf("Memory not allocated.\n");
		exit(0);
	}
	else {

		// Memory has been successfully allocated
		printf("Memory successfully allocated using malloc.\n");

		for (i = 0; i < n; ++i) {
			ptr[i] = i + 1;
		}
		printf("The elements of the array are: ");
		for (i = 0; i < n; ++i) {
			printf("%d, ", ptr[i]);
		}
	}





	
	printf("\n\n\n");
	return 0;
}