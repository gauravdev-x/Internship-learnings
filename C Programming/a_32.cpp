//WAP to use structure variable as pointer.
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct staff
{
int id;
char name[50];
long salary;
};
struct staff *s;   //Structure variable as pointer
void main()
{
clrscr();
printf("Enter the Staff details\n\n");
printf("Enter staff id : ");
scanf("%d",&s->id);
fflush(stdin);
printf("Enter staff Name : ");
gets(s->name);
printf("Enter Staff Salary : ");
scanf("%ld",&s->salary);

//print the details of staff

printf("\n\nDetails of Staff\n");
printf("Staff Id=%d\n",s->id);
printf("Staff Name=%s\n",s->name);
printf("Staff Salary=%ld\n",s->salary);
getch();
}




