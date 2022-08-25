#include <stdio.h>

void hello() {
	printf("Hello There!");
}

void add(int n1, int n2) {
	printf("N1 + N2 = %d", n1 + n2);
}

int findPow(int base, int exp) {
	int ans = 1;

	for (int i = 0; i < exp; i++) {
		ans *= base;
	}

	return ans;
}

void printAns(int ans) {
	printf("Ans = %d", ans);
}

int addNumbers(int a, int b) {
	int result = a + b;
	return result;
}

int findFactorial(int x) {
	int ans = 1;
	for (int i = 1; i <= x; i++) {
		ans = i * ans;
	}
	return ans;
}

int main() {

	// fonksiyonlar
	/*
		// returnType functionName(param1, param2 ...){

			code
			code
			code
		}
	*/

	//printf("Adssdad"); // function call

	//hello();
	//add(7,8);

	/*int ans = findPow(5, 2);
	printAns(ans);*/

	//int returned = addNumbers(5, 10);
	//printf("%d", returned);

	/*for (int i = 0; i < 10; i++) {
		int ans = findFactorial(i);
		printf("%d! = %d\n",i, ans);
	}*/

	
	
	return 0;
}