//WAP to convert binary number to its decimal equivalent.
#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
clrscr();
int b,n=0,i=0,r;
printf("Enter the binary number : ");
scanf("%d",&b);
do
{
r=b%10;
if(r!=0)
n=n+pow(2,i);
i++;
b=b/10;
}
while(b>0);
printf("Decimal equivalent of given binary = %d",n);
getch();
}