#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#pragma warning (disable:4996)

struct user {
	int ID;
	char name[50];
	int balance;
};

struct user userList[255];

void menu();
void intro();
void addUser();
void showInfo(int id);
void wait();
void deposit();
void widthraw(int id);

void intro() {
	printf("**************************************************\n");
	printf("*\t\t\t\t\t\t\t*");
	printf("* \t\tWELCOME TO JUNGLE\t\t\t*");
	printf("*\t\t\t\t\t\t\t*");
	printf("**************************************************\n\n");
	printf("Loading main menu in");
	wait();

	menu();
}

void wait() {
	printf(" %d.", 3);
	Sleep(250);
	printf(".");
	Sleep(250);
	printf(".");
	Sleep(250);
	printf("%d.", 2);
	Sleep(250);
	printf(".");
	Sleep(250);
	printf(".");
	Sleep(250);
	printf("%d.", 1);
	Sleep(250);
	printf(".");
	Sleep(250);
	printf(".");
	Sleep(250);
	system("cls");
}

void menu() {
	system("cls");
	do {
		printf("[1] Add User \n");
		printf("[2] Show info \n");
		printf("[3] Deposit \n");
		printf("[4] Withdraw \n");
		printf("[5] Exit \n");
		printf("Pick one : ");
		int choice;
		char dummy;
		scanf("%d", &choice);

		if (choice == 1) {
			scanf("%c", &dummy);
			addUser();
		}
		else if (choice == 2) {
			scanf("%c", &dummy);
			system("cls");
			printf("ID :");
			int id;
			scanf("%d", &id);

			showInfo(id);
		}
		else if (choice == 3) {
			system("cls");
			scanf("%c", &dummy);
			
			int id;
			printf("ID : ");
			scanf("%d", &id);

			deposit(id);
		}
		else if (choice == 4) {
			system("cls");
			scanf("%c", &dummy);
			int id;
			printf("ID :");
			scanf("%d", &id);
			
			widthraw(id);
		}
		else if (choice == 5) {
			FILE* fptr;
			if ((fptr = fopen("data.bin", "wb")) == NULL) {
				printf("Error!");
				exit(1);
			}

			for (int i = 0; i < 255; i++) {
				fwrite(&userList[i], sizeof(struct user), 1, fptr);
			}

			fclose(fptr);

			exit(1);
		}
		else {
			system("cls");
			printf("Smt went wrong\n");
			scanf("%c", &dummy);
			printf("Loading main menu in");
			wait();
		}
		system("cls");
	} while (1);
}

void widthraw(int id) {
	for (int i = 0; i < 255; i++) {
		if (userList[i].ID == id) {
			int j;
			printf("How much u need :");
			scanf("%d", &j);
			if (j <= userList[i].balance) {
				userList[i].balance -= j;
				printf("Withdraw is success!\n");
				printf("Loading main menu in ");
				wait();
				return;
			}
			else {
				printf("Low Balance. ");
				wait();
				return;
			}
		}
	}
}

void addUser() {
	system("cls");
	struct user user1;

	printf("Name : ");
	fgets(user1.name, sizeof(user1.name), stdin);

	printf("ID : ");
	scanf("%d", &user1.ID);


	printf("Balance :");
	scanf("%d", &user1.balance);

	for (int i = 0; i < 255; i++) {
		if (userList[i].ID == user1.ID) {
			printf("\nUser already exists!\nReturning to main menu in ");
			wait();
			return;
		}
		if (userList[i].balance == 0 && userList[i].ID == 0 && userList[i].name[0] == '\0') {
			userList[i] = user1;

			printf("\nUser has been added!\nReturning to main menu in");
			wait();

			return;
		}
	}
}

void showInfo(int id) {
	for (int i = 0; i < 255; i++) {
		if (userList[i].ID == id) {
			system("cls");
			printf("ID: %d\n", userList[i].ID);
			printf("Name: %s", userList[i].name);
			printf("Balance: %d\n", userList[i].balance);

			printf("\nReturning to main menu!");
			wait();
			return;
		}
	}
	printf("User not found!");
	wait();
}

void deposit(int id) {
	for (int i = 0; i < 255; i++) {
		if (userList[i].ID == id) {
			printf("Amount :");
			int amount;
			scanf("%d", &amount);

			userList[i].balance += amount;

			printf("Balance has been updated! ",id);
			wait();
			return;
		}
	}

	printf("User not found!");
	wait();
}


int main() {
	FILE* fptr;

	if ((fptr = fopen("data.bin", "rb")) == NULL) {
		printf("Error!");
		exit(1);
	}

	for (int i = 0; i < 255; i++) {
		fread(&userList[i], sizeof(struct user), 1, fptr);
	}

	fclose(fptr);

	intro();

	return 0;
}