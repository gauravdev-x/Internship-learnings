/*WAP to find factorial of a given number using Recursion.*/
#include<stdio.h>
#include<conio.h>
int fact(int);
void main()
{
clrscr();
int n,f;
printf("Enter the Number : ");
scanf("%d",&n);
f=fact(n);
printf("Factorial of %d is %d",n,f);
getch();
}
int fact(int x)
{
if(x==1||x==0)
{
return 1;
}
else
{
return(x*fact(x-1));
}
}