//WAP to swap two numbers using call by reference.
#include <stdio.h>
#include <conio.h>
void main()
{
clrscr();
int a,b;
void swap(int *,int *);  //Declaration of function
printf("Enter two numbers : ");
scanf("%d%d",&a,&b);
swap(&a,&b);      //Calling of function
printf("a=%d\tb=%d\n",a,b);
getch();
}
void swap(int *x , int *y)
{
int t;
t=*x;
*x=*y;
*y=t;
}










