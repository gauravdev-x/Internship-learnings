//WAP to print the series of prime number in given range.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int lower,upper;
int i,j,c=0;
printf("Enter the lower limit : ");
scanf("%d",&lower);
printf("Enter the upper limit : ");
scanf("%d",&upper);
for(i=lower;i<=upper;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if (c==2)
{
printf("%d\t",i);
}
}
getch();
}