#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
clrscr();
int i,num;
printf("enter the number");
scanf("%d",&num);
for(i=1;i<10;i++)
{
printf("\n%d*%d=%d",num,i,num*i);
}
getch();
}