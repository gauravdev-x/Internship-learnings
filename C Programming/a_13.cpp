//WAP to take an array with 10 numbers.Now find greatest number of array.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[10],i;
printf("Enter the number of array : \n");
for(i=0;i<10;i++)
{
scanf("%d",&A[i]);
}
for(i=0;i<10;i++)
{
if(A[0]<A[i])
{
A[0]=A[i];
}
}
printf("The largest number is Array : %d",A[0]);
getch();
}