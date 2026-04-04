/*WAP to find the roots of quaratic equation ax2 +bx +c=0*/
#include <stdio.h>
#include<conio.h>
#include<maths.h>
void main()
{
clrscr();
int b ,a,c ,r1,r2,sum;
printf("Enter the value of a,b,c of the quaratic equation\n");
scanf("%d%d%d",&a,&b,&c);
sum=(b*b)-4*a*c;
if(sum<0)
{
printf("Roots are not possible");
}
else
{
r1=(-b+sum)/(2*a);
r2=(-b-sum)/(2*a);
printf("Roots are %d, %d",r1,r2);
}
getch();
}