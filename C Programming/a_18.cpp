//WAP to check the matrix is identical(equal) or not.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[3][3],B[3][3];
int i,j,count=0;
printf("Enter the First Matrix(3x3) \n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&A[i][j]);
}
}
printf("Enter the Second Matrix(3x3) \n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&B[i][j]);
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(A[i][j]==B[i][j])
{
count=1;
}
}
}
if(count==1)
{
printf("Both matrix are identical");
}
else
{
printf("Both matrix are NOT identical");
}
getch();
}