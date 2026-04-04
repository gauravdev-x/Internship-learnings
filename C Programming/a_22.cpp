//WAP to demostrate the concept of pointer.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a;
int *ptr;
*ptr=&a;
printf("Enter any number : ");
scanf("%d",&a);
printf("The value entered is : %d ",a);
getch();
}