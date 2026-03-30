#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int num;
printf("Enter a number : ");
scanf("%d", &num);
if((num%2)==0)
{
printf("/n Even Number");
}
else
{
printf("/n  odd Number");
}
getch();
}