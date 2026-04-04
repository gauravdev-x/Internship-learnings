//WAP to coordinate point in a XY coordinate system and determine its quadrant.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int x,y;
printf("Enter the value of X and Y respectivly ");
scanf("%d%d",&x,&y);
if(x>0&&y>0)
printf("Point lie in first quadrant");
else if(x<0&&y>0)
printf("Point lie in second quadrant");
else if(x<0&&y<0)
printf("Point lie in third quadrant");
else if(x>0&&y<0)
printf("Point lie in Fourth quadrant");
else
printf("Point lie either on X axis or Y axis");
getch();
}