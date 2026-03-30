//
//WAP to find the sum of digit of given number.
#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int rev=0,n,r;
printf("Enter the number : ");
scanf("%d",&n);
do
{
r=n%10;
rev=rev+r;
n=n/10;
}
while(n>0);
printf("The sum of the digits of number = %d",rev);
getch();
}

