#include <stdio.h>
#include <stdbool.h>
#pragma warning (disable:4996)

int main() {

	//											FLOW CONTROL !

	/*
	
				if(){


				}
				else if(){
				
				}
				else{

				}
	
	
	*/
	/*int sayi;

	printf("Bir sayi giriniz");
	scanf_s("%d", &sayi);

	if (sayi < 0) {
		printf("Sayi negatif");
	}
	else if(sayi == 0) {
		printf("Sayi 0");
	}
	else {
		printf("Sayi pozitif");
	}*/

	/*int sayi1;
	int sayi2;
	int sayi3;

	printf("Number1:");
	scanf_s("%d", &sayi1);
	printf("Number2:");
	scanf_s("%d", &sayi2);
	printf("Number3:");
	scanf_s("%d", &sayi3);

	if (sayi1 > sayi2 && sayi1 > sayi3) {
		
		if (sayi2 > sayi3)
			printf("%d > %d > %d", sayi1, sayi2, sayi3);
		else
			printf("%d > %d > %d", sayi1, sayi3, sayi2);

	}
	else if (sayi2 > sayi1 && sayi2 > sayi3) {
		if (sayi3 > sayi1)
			printf("%d > %d > %d", sayi2, sayi3, sayi1);
		else
			printf("%d > %d > %d", sayi2, sayi1, sayi3);
	}
	else {
		if (sayi1 > sayi2)
			printf("%d > %d > %d", sayi3, sayi1, sayi2);
		else
			printf("%d > %d > %d", sayi3, sayi2, sayi1);
	}*/

	// 24 98 45
	// 98 > 45 > 28

	//switch (age) {
	//case 18:
	//	//code 
	//	break;
	//case 20:
	//	//code
	//	break;
	//case 30:
	//	//code
	//	break;
	//default:
	//	//code
	//	break;
	//}

	//char op;

	//printf("Enter an operator: ");
	//scanf("%c", &op);

	//int sayi1, sayi2;

	//printf("Enter two numbers: ");
	//scanf("%d %d",&sayi1,&sayi2);

	//switch (op) {
	//	case '+':
	//		printf("%d + %d = %d\n", sayi1, sayi2, (sayi1 + sayi2));
	//		break;
	//	case '-':
	//		printf("%d - %d = %d\n", sayi1, sayi2, (sayi1 - sayi2));
	//		break;
	//	case '/':
	//		if (sayi2 == 0)
	//		{
	//			printf("Don't be a prick!");	// exception handling!
	//			break; 
	//		}	
	//		printf("%d / %d = %d\n", sayi1, sayi2, (sayi1 / sayi2));
	//		break;
	//	case '*':
	//		printf("%d * %d = %d\n", sayi1, sayi2, (sayi1 * sayi2));
	//		break;
	//	case '%':
	//		printf("%d %c %d = %d\n", sayi1, '%', sayi2, (sayi1 % sayi2));
	//		break;
	//	default :
	//		break;
	//}		


	/*
											LOOPS 

			for


			while
	
	
	*/
	


	/*for (int i = 0; i <= 20; i++) {
		if (i % 2 == 0)
			printf("%d\n", i);
	}*/


	/*int i = 0;

	while (i<=20) {
		if (i % 2 == 0)
			printf("%d\n", i);
		i++;
	}*/

	/*int num = 0, sum = 0;

	while (num >= 0) {
		sum += num;
		
		printf("Enter a number: ");
		scanf("%d", &num);
	}
	printf("Sum = %d", sum);*/
	
	// EBOB - EKOK (GCD-LCM)		

	// 54 81	

	//int n1, n2, min;
	//printf("Enter two numbers: ");
	//scanf("%d %d", &n1, &n2);

	//// ternary Operator
	//min = (n1 < n2) ? n1 : n2;

	//for (int i = min; i > 0; i/=2) {
	//	if (n1 % i == 0 && n2 % i == 0) {
	//		printf("EBOB = %d", i);
	//		break;
	//	}
	//}

	// 4 6 
	
	/*int num1, num2;
	printf("Enter two numbers: ");
	scanf("%d %d", &num1, &num2);
	
	int max = (num1 > num2) ? num1 : num2;
	int count = 0;
	
	for (int i = max; true; i += max) {
		count++;
		if (i % num1 == 0 && i % num2 == 0) {
			printf("\n%d Ekoktur\nCount = %d", i,count);
			break;
		}
	}*/

	//int num;
	//printf("Enter a number: ");
	//scanf("%d", &num);

	//// 5 4 3 2 1
	//// ans = 120

	//int ans = 1;
	//for (int i = 1; i <= num; i++) {
	//	ans = ans * i;
	//}

	//printf("Ans = %d", ans);

	/*
	
*
* *
* * *
* * * *
* * * * *
	
	*/

	//for (int row = 1; row <= 5; row++) {
	//	for (int col = 1; col <= row; col++) {	// debug
	//		printf("* ");
	//	}
	//	printf("\n");
	//}

	/*
	
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5

	*/

	/*for (int row = 1; row <= 5; row++) {
		for (int num = 1; num <= row; num++) {
			printf("%d ", num);
		}
		printf("\n");
	}*/

	/*
	
A
B B
C C C
D D D D
E E E E E

	*/

	//for (int letter = 65; letter < 70; letter++) {
	//	for (int col = 65; col <= letter; col++) {
	//		printf("%c ", letter);
	//	}
	//	printf("\n");
	//}
	//

/*

* * * * *
* * * *
* * *
* *
*

*/
	
	/*for (int i = 5; i >= 0; i--) {
		for (int col = 0; col <= i; col++) {
			printf("* ");
		}
		printf("\n");
	}*/
	

	
/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/
	
	/*for (int i = 5; i >= 0; i--) {
		for (int col = 1; col <= i; col++) {
			printf("%d ", col);
		}
		printf("\n");
	}*/

/*

	    *
	  * * *
	* * * * *				f(x) = 2*x-1
  * * * * * * *
* * * * * * * * *

*/

	/*for (int row = 1; row <= 5; row++) {
		for (int emp = 4; emp >= row; emp--) {
			printf("  ");
		}

		for (int star = 1; star <= 2*row-1 ; star++) {
			printf("* ");
		}
		printf("\n");
	}*/

/*

* * * * * * * * *
  * * * * * * *
	* * * * *
	  * * *
		*

*/

	/*for (int row = 5; row >= 0; row--) {
		for (int emp = 0; emp < 5-row; emp++) {
			printf("  ");
		}
		
		for (int star = 0; star < 2 * row - 1; star++) {
			printf("* ");
		}
		printf("\n");
		
	}*/

/*

1
2 3
4 5 6
7 8 9 10

*/

	/*int num = 1;

	for	(int row = 1; row <= 4; row++) {
		for (int col = 1; col <= row; col++,num++)
			printf("%d ", num);
		printf("\n");	
	}	*/

/*

			1
		  2 3 2
		3 4 5 4 3
	  4 5 6 7 6 5 4
	5 6 7 8 9 8 7 6 5
*/

/*

			1
		  2 3 2
		3 4 5 4 3
	  4 5 6 7 6 5 4
	5 6 7 8 9 8 7 6 5

*/

int rows, i, space, count = 0, k = 0, count1 = 0;

	printf("Enter the number of rows: ");
	scanf_s("%d", &rows);

	for (i = 1; i <= rows; ++i) {
		for (space = 1; space <= rows - i; ++space) {
			printf("  ");
			++count;
		}
		while (k != 2 * i - 1) {
			if (count <= rows - 1) {
				printf("%d ", i + k);
				count++;
			}
			else {
				++count1;
				printf("%d ", (i + k - 2 * count1));
			}
			++k;
		}
		count = count1 = k = 0;
		printf("\n");
	}
	
	return 0;
}