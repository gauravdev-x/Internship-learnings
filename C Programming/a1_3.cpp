//WAP to find greatest number between two unequal number
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a,b;
printf("Enter the First Number : ");
scanf("%d",&a);
printf("Enter the Second Number : ");
scanf("%d",&b);
if(a==b)
{
printf("Both Numbers are equal");
}
else if(a<b)
{
printf("Second number is greatest");
}
else
{
printf("First number is greatest");
}
getch();
}