//WAP to write information into the file
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
clrscr();
int empid;
char empname[50];
long salary;
FILE *ptr; 		//File pointer
printf("Enter employee Id : ");
scanf("%d",&empid);
fflush(stdin);
printf("Enter employee Name : ");
gets(empname);
printf("Eneter Employee Salary : ");
scanf("%ld",&salary);
ptr=fopen("app.txt","a");
fprintf(ptr,"Employee Id =%d\n",empid);
fprintf(ptr,"Employee Name =%s\n",empname);
fprintf(ptr,"Employee Salary=%ld\n",salary);
fclose(ptr);
printf("Data is saved in file\n");
getch();
}