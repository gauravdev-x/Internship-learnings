//WAP to develop a program in C to calculate the area and perimeter of a rectangle
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int l,b,a,p;
printf("Area and perimeter of Rectangle\n");
printf("Enter Length of the Rectangle\n");
scanf("%d",&l);
printf("Enter Breath of the Rectangle\n");
scanf("%d",&b);
a=l*b;
p=2*(l+b);
printf("Area of Rectangle = %d\n",a);
printf("Perimeter of Rectangle = %d\n",p);
getch();
}