//WAP to find volume of cuboid using user-defined function.
#include<stdio.h>
#include<conio.h>
int volume(int,int,int);
void main()
{
clrscr();
int l,b,h,v;
printf("Enter Length Breath and Height of the Cuboid\n");
scanf("%d%d%d",&l,&b,&h);
v=volume(l,b,h);
printf("The volume of Cuboid is %d",v);
getch();
}
int volume(int x, int y, int z)
{
return(x*y*z);
}