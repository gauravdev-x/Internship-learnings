//Matrix Multiplication
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[3][3],B[3][3],RES[3][3];
int i,j,k;
printf("Enter the elements of first matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&A[i][j]);
}
}
printf("Enter the elements of Second Matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&B[i][j]);
}
}
//Matrix Multiplication
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
RES[i][j]=0;
for(k=0;k<3;k++)
{
RES[i][j]=RES[i][j]+A[i][k]*B[k][j];	//code for multiply
}
}
}
printf("Resultant Matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
printf("%d\t",RES[i][j]);
}
printf("\n");
}
getch();
}