//WAP to demonstrate difference between Structure and Union
#include<stdio.h>
#include<conio.h>
struct emp1
{
int empid;
char empname[50];
long salary;
}; 
union emp2
{
int empid;
char empname[50];
long salary;
}; 
void main()
{
clrscr();
printf("Memory required for emp1(Structure) %d bytes\n",sizeof(emp1));
printf("Memory required for emp2(Union) %d bytes\n",sizeof(emp2));
getch();
}