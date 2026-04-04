//WAP to find sum and average of 10 numbers using arrays
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int i,A[10];
int sum=0;
float avg;
printf("Enter 10 numbers :\n");
for(i=0;i<10;i++)
{
scanf("%d",&A[i]);
sum=sum+A[i];
}
avg=sum/10;
printf("Sum of following numbers is : %d \n",sum);
printf("Average of following numbers is : %f ",avg);
getch();
}
