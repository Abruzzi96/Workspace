#include <stdio.h>
#include <stdlib.h>

void red() {
	printf("\033[1;31m");
}

void yellow() {
	printf("\033[0;33m");
}

void cyan() {
	printf("\033[0; 36m");
}

void purple() {
	printf("\033[0;35m");
}

void green() {
	printf("\033[0;32m");
}

void reset() {
	printf("\033[0m");
}

void header() {
	red();
	printf("\n\n============================ Welcome to Who Wants To Be a Millionare! =============================\n\n");
	purple();
}



int main() {
	header();
	char ans;

	printf("Question 1-)\n\nWho invented the first computer?\n");
	printf("A-) Alan Turing\n");
	printf("B-) Albert Einstein\n");
	printf("C-) Hitler\n");
	printf("D-) Stalin\n");

	green();
	printf("\nInput: ");
	scanf_s("%c", &ans);

	if (ans == 'A' || ans == 'a') {
		red();
		system("cls");
		header();
		fseek(stdin, 0, SEEK_END);

		purple();
		printf("Question 2-)\n\n2+2?\n");
		printf("A-) 4\n");
		printf("B-) 5\n");
		printf("C-) 6\n");
		printf("D-) 7\n");
		
		green();
		printf("\nInput: ");
		scanf_s("%c", &ans);
		
		if (ans == 'A') {
			red();
			system("cls");
			header();
			fseek(stdin, 0, SEEK_END);

			purple();
			printf("Question 3-)\n\n5+5?\n");
			printf("A-) 2\n");
			printf("B-) 10\n");
			printf("C-) 4\n");
			printf("D-) 5\n");

			green();
			printf("\nInput: ");
			scanf_s("%c", &ans);

			if (ans == 'B' || ans == 'b') {
				red();
				system("cls");
				header();
				fseek(stdin, 0, SEEK_END);

				purple();
				printf("Question 4-)\n\n3+3?\n");
				printf("A-) 1\n");
				printf("B-) 5\n");
				printf("C-) 6\n");
				printf("D-) 8\n");

				green();
				printf("\nInput: ");
				scanf_s("%c", &ans);

				if (ans == 'C' || ans == 'c') {
					red();
					system("cls");
					header();
					fseek(stdin, 0, SEEK_END);

					purple();
					printf("Question 5-)\n\n8/2?\n");
					printf("A-) 1\n");
					printf("B-) 2\n");
					printf("C-) 5\n");
					printf("D-) 4\n");

					green();
					printf("\nInput: ");
					scanf_s("%c", &ans);

					if (ans == 'D' || ans == 'd') {
						system("cls");
						green();
						printf("=========================================== Y O U  W O N ===========================================\n\n\n");
					}
					else {
						red();
						printf("==================== G G ====================\n\n\n");
					}
				}
				else {
					red();
					printf("==================== G G ====================\n\n\n");
				}
			}
			else {
				red();
				printf("==================== G G ====================\n\n\n");
			}
		}
		else {
			red();
			printf("==================== G G ====================\n\n\n");
		}
	}
	else {
		red();
		printf("==================== G G ====================\n\n\n");
	}
	









	return 0;
}
