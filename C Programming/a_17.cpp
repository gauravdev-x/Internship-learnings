//WAP to multiply matrix two matrices
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[3][3],B[3][3],P[3][3];
int i,j,k;
printf("Enter the First matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&A[i][j]);
}
}
printf("Enter Second Matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&B[i][j]);
}
}
//code for multiplications
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
P[i][j]=0;
for(k=0;k<3;k++)
{
P[i][j]=P[i][j]+A[i][k]*B[k][j]; //Code for multiplication 
}
}
}
printf("Resultant matrix is\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
printf("%d\t",P[i][j]);
}
printf("\n");
}
getch();
}