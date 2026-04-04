//WAP to take an Array  with 10 numbers. Now take the number as input and search the number in array using linear search.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[10],i,n;
int count=0;
printf("Enter 10 numbers : \n");
for(i=0;i<10;i++)
{
scanf("%d",&A[i]);
}
printf("Enter the number to be searched : ");
scanf("%d",&n);
for(i=0;i<10;i++)
{
if(A[i]==n)
{
count++;
printf("The number is at %d position \n",(i+1));
}
}
if(count==0)
{
printf("The number is not present");
}
getch();
}
