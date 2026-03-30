/* WAP to accept the salary of an employee from the user. calculate the gross salary on the following basis
BASIS			HRA	DA
1-4000			10%	50%
4000-8000		20%	60%
8001-12000		25%	70%
12000 and above	30%	80%  */

#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
float da,hra,sal,total;
printf("Enter the gross salary on which HRA and is to calculated : ");
scanf("%f",&sal);
if(sal>=1&&sal<4000)
{
hra = (10*sal)/100;
da = (50*sal)/100;
total =sal+hra+da;
}
else if(sal>=4000&&sal<8000)
{
hra = (20*sal)/100;
da = (60*sal)/100;
total =sal+hra+da;
}
else if(sal>=8000&&sal<12000)
{
hra = (25*sal)/100;
da = (70*sal)/100;
total =sal+hra+da;
}
else if(sal>=12000)
{
hra = (30*sal)/100;
da = (80*sal)/100;
total =sal+hra+da;
}
else
{
printf("Invaid Salary");
}
printf("Total Salary after DA and HRA = %f",total);
getch();
}