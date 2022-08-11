#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "Turkish");



	//								DATA TYPES
	/*
	
			int			decimal number				4byte	
			char		character					1 byte
			float		floating point number		4byte
			double		floating point number		8byte	
	*/

	//variable declaration
	//int age = 25;
	//float ort = 3.14;
	//double gpa = 3.14;

	//printf("Benim adým Mert.\nBen %d yaþýndayým.\n",age);
	//printf("Benim ortalamam %.2f.\nBenim GPA = %.2lf", ort,gpa);

	//int age;

	//printf("Yaþýnýzý giriniz: ");
	//scanf_s("%d", &age);

	//printf("Yaþýnýz = %d", age);

	//thread programming 

	/*for (int i = 0; i < 100; i++) {
		if (i == 55) {
			printf("Password Found!");
		}
	}*/ 

	//int age;
	//
	//printf("Yaþýnýzý giriniz: ");
	//scanf_s("%d", &age);

	//float ort;

	//printf("Ortalamanýzý giriniz: ");
	//scanf_s("%f", &ort);

	//printf("Benim adým Mert. Ben %d yaþýndayým. Benim ortalamam %.2f", age, ort);

	//								OPERATORS

	/*
	
			1. Arithmetic Operators

					+
					-
					*
					/
					%

					printf("%d",(5+3));


			2. Increment/Decrement Operators
					
					++
					--

					int num1 = 5;
					printf("Number = %d\n", num1); // 5
					printf("Number = %d\n", num1++); // 5
					printf("Number = %d\n\n", num1); // 6

					int num2 = 5;
					printf("Number = %d\n", num2); // 5
					printf("Number = %d\n", num2--); // 5
					printf("Number = %d\n", num2); // 4

			3. Assignment Operators

					=
					+=			a += 5	==> a = a + 5
					-=
					*=
					/=
					%=		


					int num = 0;

					num += 5;
					printf("Number = %d\n", num); // 5

					num -= 4;
					printf("Number = %d\n", num); // 0

					num *= 5;
					printf("Number = %d\n", num); // 0

					num /= 5;
					printf("Number = %d\n", num); // 0

					num %= 5;
					printf("Number = %d\n", num); // 0

			4. Relational Operators

					==			
					!=
					<
					>
					<=
					>=	

					int num1 = 5;
					int num2 = 10;
					int num3 = 5;

					printf("%d\n", (num1 == num3)); // 1
					printf("%d\n", (num2 == num3)); // 0
					printf("%d\n", (num2 != num3)); // 1
					printf("%d\n", (num2 >= num3)); // 1
					printf("%d\n", (num2 <= num3)); // 0

			5. Logical Operators

					&&
					||
					!
					
					(name == "Ayberk") && (pass == 1234)
					(name == "Ayberk") || (pass == 1234)
					!(name == "Ayberk") 

					int num1 = 5, num2 = 10;

					printf("%d", (num1 == 5) && (num2 == 10));
					printf("%d", (num1 == 1) || (num2 == 20));
					printf("%d", !(num1 == 5));
*/
int num1, num2;
	printf("Sayýyý giriniz:");
	scanf_s("%d", &num1);

	printf("2. Sayýyý giriniz:");
	scanf_s("%d", &num2);

	printf("Number 1 = %d\n", num1); // 5
	printf("Number 2 = %d\n", num2); // 10

	printf("\n");
	
	// code

	//int num3 = num1, num4 = num2;
	int num3;
	(num3 = num1) && (num1 = num2) && (num2 = num3);


	printf("Number 1 = %d\n", num1); // 10
	printf("Number 2 = %d\n", num2); // 5



	

	printf("\n\n");
	return 0;
}