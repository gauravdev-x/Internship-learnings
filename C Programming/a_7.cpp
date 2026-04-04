/* WAP to print the table of given number in following format.
2*1=2
2*2=4
.
.
.
2*10=20  */
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int num,p,i;
printf("Enter the number of which table is to be printed : ");
scanf("%d",&num);
printf("\nTable of %d is as follows\n",num);
for(i=1;i<=10;i++)
{
p=num*i;
printf("%d * %d = %d\n",num,i,p);
}
getch();
}