//WAP to use Array of Structure Variables.
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct employee
{
int empid;
char empname[50];
long salary;
};
struct employee s[3];  // 's' is the Array of structure variables
void main()
{
clrscr();
int i;
printf("Enter the Employee's Details\n\n");
for(i=0;i<3;i++)
{
printf ("Enter details of Employee %d\n",(i+1));
printf("Enter the Employee Id : ");
scanf("%d",&s[i].empid);
fflush(stdin);
printf("Enter name of the Employee : ");
gets(s[i].empname);
printf("Enter Salary : ");
scanf("%ld",&s[i].salary);
}
clrscr();
//Print the Details of Employee

printf("Details of Employee \n\n");
for(i=0;i<3;i++)
{
printf("Details of Employee : %d\n",(i+1));
printf("Employee Id=%d\n",s[i].empid);
printf("Employee Name=%s\n",s[i].empname);
printf("Salary=%ld\n",s[i].salary);
}
getch();
}

