//WAP to find volume of cuboid using fuction
#include <stdio.h>
#include <conio.h>
int volume(int,int,int); // Declaration of Function
void main()
{
clrscr();
int l,b,h,v;
printf("Enter length, breath and height of cuboid /n");
scanf("%d%d%d",&l,&b,&h);
v=volume(l,b,h); //calling of function
printf("volume of cuboid = %d\n",v);
getch();
}
int volume(int x,int y,int z) //Defination of function
{
return(x*y*z);

}