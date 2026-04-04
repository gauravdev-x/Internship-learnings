//WAP to create dynamic array using calloc() 
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
clrscr();
int i,n;
int *p;
printf("How many numbers you want in list? ");
scanf("%d",&n);
p=(int*)calloc(sizeof(int),n);
printf("Enter %d numbers\n",n);
for(i=0;i<n;i++)
{
scanf("%d",&p[i]);
}
printf("You have entered following numbers\n");
for(i=0;i<n;i++)
{
printf("%d\n",p[i]);
}
getch();
}