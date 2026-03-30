/*WAP to find the number is prime or not*/
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a ,i,count=0;
printf("Enter the number to be checked \n");
scanf("%d",&a);
for(i=2;i<a;i++)
{
if(a%i==0)
{
count=1;
}
}
if(count==0)
{
printf("The number is prime ");
}
else
{
printf("The number is not prime");
}
getch();
}