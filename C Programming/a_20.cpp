//WAP to swap two number by using function 
#include<stdio.h>
#include<conio.h>
void swap(int *, int *);
void main()
{
clrscr();
int a,b;
printf("Enter the first number : ");
scanf("%d",&a);
printf("Enter the Second number : ");
scanf("%d",&b);
swap(&a, &b);
printf("First number : %d\t Second number : %d",a,b);
getch();
}
void swap(int *x, int *y)
{
int t;
t = *x;
*x = *y;
*y = t;
}
