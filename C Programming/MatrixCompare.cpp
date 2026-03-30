//WAP to Check given 2 Matrices are Equal or Not

#include <stdio.h>
#include <conio.h>

void main()
{
  clrscr();
	int A[3][3],B[3][3];
	int i,j,f=0;

	printf("Enter the first matrix \n");
	for(i=0;i<3;i++)
	{
	   for(j=0;j<3;j++)
	   {
	      scanf("%d",&A[i][j]);
	   }
	}

	printf("Enter the second matrix \n");
	for(i=0;i<3;i++)
	{
	   for(j=0;j<3;j++)
	   {
	      scanf("%d",&B[i][j]);
	   }
	}

//Code to check two matrices are equal or not

	for(i=0;i<3;i++)
	{
	   for(j=0;j<3;j++)
	   {
	      if(A[i][j]==B[i][j])
	      {
		continue;
	      }
		else
		{
		f=1;
		break;
		}
	   }
	}
	if(f==0)
	{
	  printf("Matrices are  equal\n");
	}
	else 
	{
	  printf("Matrices are not equal\n");
	}
  getch();
}