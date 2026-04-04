/*WAP to multiply matrix two matrices*/
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[3][3];
int i,j;
printf("Enter the First matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&A[i][j]);
}
}
printf("Resultant matrix is\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
	if(i==j)
	{
printf("%d\t",A[i][j]);
	}
}
}
getch();
}