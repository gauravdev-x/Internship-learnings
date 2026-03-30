//WAP to find factorial using recursion
#include<stdio.h>
#include<conio.h>
int fact(int);
void main()
{
clrscr();
int n,f;
printf("Enter a Number : ");
scanf("%d",&n);
f=fact(n);
printf("The Factorial of Number : %d",f);
getch();
}
int fact(int x)
{
if(x==0||x==1)
{
	return 1;
}
else{
return (x*fact(x-1));
}
}
