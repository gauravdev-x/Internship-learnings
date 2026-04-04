//WAP to implement concept of structure.
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
void main()
{
clrscr();
struct employee
{
int empid;
char empname[50];
long salary;
};
struct employee e;  //'e' is the structure variable.
printf("Enter Employee's Details\n");
printf("Enter Employee Id : ");
scanf("%d",&e.empid);
fflush(stdin);		//clears the buffer after the interger value input.
printf("Enter Employee Name : ");
gets(e.empname);
printf("Enter Employee Salary : ");
scanf("%ld",&e.salary);
printf("\nEmpoyee's Details\n");
printf("Employee Id=%d\n",e.empid );
printf("Employee Name=%s\n",e.empname);
printf("Employee Salary=%ld\n",e.salary);
getch();
}