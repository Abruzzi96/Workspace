#include <stdio.h>
#include <stdbool.h>
#include <math.h>


int carp(int sayi1, int sayi2) {
	int sonuc = sayi1 * sayi2;
	return sonuc;
}

bool isPrime(int number) {
	int count = 1;
	if (number < 2)
		return false;
	
	for (int i = 2; i < sqrt(number); i++) {
		printf("%d\n", count++);
		if (number % i == 0) {
			return false;
		}
	}

	return true;
}

int ebob(int num1, int num2) {
	int ebob;

	if (num1 < num2) {
		ebob = num1;
	}
	else {
		ebob = num2;
	}

	for (ebob; ebob > 0; ebob--) {
		if (num1 % ebob == 0 && num2 % ebob == 0) {
			return ebob;
		}
	}
}

// recursion

//void x() {
//	printf("Mert");
//	x();
//}

//int findFactorial(int x) {
//	int ans = 1;
//	for (int i = 1; i <= x; i++) {
//		ans = i * ans;
//	}
//	return ans;
//}
//
//int fact(int num) {
//	if (num == 1)
//		return 1;
//	return num * fact(num - 1);
//}

//int sum(int num) {
//	if (num == 1)
//		return 1;
//	return num + sum(num - 1);
//}

//int power(int base, int exp) {
//	if (exp == 1)
//		return base;
//	return base * power(base, exp - 1);
//}

//int reverse(int num) {
//	int rem, reversed = 0;
//
//	// 1234
//	// 5
//	while (num != 0) {
//		rem = num % 10;
//		num = num / 10; // num /= 10
//		reversed = reversed * 10 + rem;
//	}
//
//	return reversed;
//}

//void reverseSentence() {
//	char c;
//	scanf_s("%c", &c);
//
//	if (c != '\n') {
//		reverseSentence();
//		printf("%c", c);
//	}
//}

//long long convertDecimalToBinary(int n) {
//	long long bin = 0;
//	int rem, i = 1;
//
//	while (n != 0) {
//		rem = n % 2;
//		n /= 2;
//		bin += rem * i;
//		i *= 10;
//	}
//	return bin;
//}

/*

			Write a function that converts given binary number to decimal.

*/


int main() {
	
	//printf("%d", carp(5, 6));
	// printf("\n\Ans = %d", isPrime(997));
	//int ans = ebob(81, 54);
	//printf("%d", ans);
	//printf("%d", fact(4));
	//printf("%d", sum(10));
	//printf("%d", power(4,4));
	//printf("%d", reverse(12345));

	/*printf("Enter a sentence: ");
	reverseSentence();*/

	//int num;
	//char c;

	//scanf_s("%d", &num); // \n
	//scanf_s("%c", &c); // A

	//printf("Num = %d\n", num); // 15
	//printf("Char = %c\n", c); // A

	//printf("%d in decimal = %lld in binary", 7, convertDecimalToBinary(7));

	return 0;
}