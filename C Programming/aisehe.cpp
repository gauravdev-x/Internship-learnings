#include <stdio.h>
#include <conio.h>
void main()
{
clrscr();
int i,n,ID[10],AGE[10];
printf("Enter the number of patients : \n");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter id of patients %d : \n",(i+1));
scanf("%d",&ID[i]);
printf("Enter age of patients %d : \n",(i+1));
scanf("%d",&AGE[i]);
}
printf("\n\n The output is \n");
for(i=0;i<n;i++)
{
printf("ID of patients %d is :%d \n Age is %d \n",n,ID[i],AGE[i]);
}
getch();
}