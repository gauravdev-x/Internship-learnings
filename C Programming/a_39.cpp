//WAP to input 10 number in an array(AR) and store its odd and even number in seprate arrays(EAR and OAR).
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int AR[10],EAR[10],OAR[10];
int i,n1=0,n2=0;		//n1 and n2 Decide the index of EAR and OAR
printf("Enter ten number in array AR\n");
for(i=0;i<10;i++)
{
scanf("%d",&AR[i]);
}
//Now seprate Even numbers and odd numbers.
for(i=0;i<10;i++)
{
if(AR[i]%2==0)
{
EAR[n1]=AR[i];
n1++;
}
else 
{
OAR[n2]=AR[i];
n2++;
}
}
printf("List of Even Numbers \n");
for(i=0;i<n1;i++)
{
printf("%d\t",EAR[i]);
}
printf("\nList of Odd Numbers \n");
for(i=0;i<n2;i++)
{
printf("%d\t",OAR[i]);
}
getch();
}