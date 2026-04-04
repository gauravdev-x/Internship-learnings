#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a[50],i,j,n,swap;
printf("Enter the number of items in array : ");
scanf("%d",&n);
printf("Enter the numbers in array\n");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
//Bubble Sort
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1-i;i++)
{
if(a[j]>a[j+1])
{
swap=a[j];
a[j]=a[j+1];
a[j+1]=swap;
}
}
}
//print sorted array
printf("-------The Sorted array is----------");
for(i=0;i<n;i++)
{
printf("%d\n",a[i]);
}
getch();
}