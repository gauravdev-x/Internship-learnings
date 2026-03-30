/*WAP to print the swap of the given digit*/
#include<stdio.h>
#include<conio.h>
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