//WAP to use malloc() for DMA(Dynamic Memory Allocation)
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
clrscr();				// Brijesh Sir 7753001621
int *p;					 // Pointer Variable		
p=(int *)malloc(sizeof(int));
printf("Enter a number : ");
scanf("%d",p);
printf("The value= %d\n",*p);
getch();
}