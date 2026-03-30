//WAP to develop a program in C to calculate the simple interest
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
float p,t,r,si;
printf("Calculation of Simple Interest\n\n");
printf("Enter Principle : ");
scanf("%f",&p);
printf("Enter Rate : ");
scanf("%f",&r);
printf("Enter Time(in years) : ");
scanf("%f",&t);
si=(p*r*t)/100;
printf("Simple Interest=%f \n", si);
getch();
}