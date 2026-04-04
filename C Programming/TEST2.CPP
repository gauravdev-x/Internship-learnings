//WAP to swap two number using call by reference
#include<stdio.h>
#include<conio.h>
void swap(int * ,int *);
void main()
{
clrscr();
int a, b;
printf("Enter two numbers : ");
scanf("%d%d",&a,&b);
swap(&a,&b);
printf("a = %d\t b = %d\n",a,b);
getch();
}
void swap(int *x,int *y)
{
int t;
t = *x;
*x = *y;
*y = t;
}