//WAP to generate Fibonaci sequence up to n terms, where the value of n is entered by user
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int i,n;
int num1=0,num2=1;
printf("Enter the number of terms of Fibonaci Series : ");
scanf("%d",n);
printf("The Fibonaci series are as follow : ")
for(i=1;i<=n;i++)
{
printf("%d\t",num1);
nnum=num1+num2;
num1=num2;
num2=nnum;
}