//WAP to Find Summation and Subtraction of 2 Matrix

#include <stdio.h>
#include <conio.h>

void main()
{
  clrscr();
	int A[3][3], B[3][3], SUM[3][3], SUB[3][3];

	printf("Enter Matrix of (3*3)\n");
	for(int i=0;i<3;i++)
	{
	   for(int j=0;j<3;j++)
	   {
	      scanf("%d",&A[i][j]);
	   }
	}

	printf("Enter Matrix B of (3*3)\n");
	for(int i=0;i<3;i++)
	{
	   for(int j=0;j<3;j++)
	   {
	      scanf("%d",&B[i][j]);
	   }
	}

//Code to find Summation and Subtraction of 2 Matrix

	for(int i=0;i<3;i++)
	{
	  for(int j=0;j<3;j++)
	  {
	    SUM[i][j]=A[i][j]+B[i][j];
	    SUB[i][j]=A[i][j]-B[i][j];
	  }
	}

//Print the Values of Matrix SUM

	printf("Summation of the matix is \n");
	for(int i=0;i<3;i++)
	{
	   for(int j=0;j<3;j++)
	   {
	     printf("%d",&SUM[i][j]);
	   }
 	  printf("\n");
	}

//Print the Values of Matrix SUB

	printf("Substration of the Matix is \n");
	for(int i=0;i<3;i++)
	{
	   for(int j=0;j<3;j++)
	   {
	      printf("%d",&SUB[i][j]);
	   }
	  printf("\n");
	}
	getch();
}











