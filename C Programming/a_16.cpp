//WAP to check whether the matrix is identity or not
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int A[3][3],i,j,count=0;
printf("Enter the element of a 3x3 matrix\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&A[i][j]);
}
}
printf("\n\nMatrix is here \n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
	printf("%d\t",A[i][j]);
}
printf("\n");
}
//code for checking matrix is identity or not
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(A[i][j]!=1&&A[j][i]!=0)
{
count=1;
break;	
}
}
}
if(count==0)
{
printf("Matrix is Identity Matrix");
}
else
{
printf("Matrix is not Identity Matrix");
} 
getch();
}




