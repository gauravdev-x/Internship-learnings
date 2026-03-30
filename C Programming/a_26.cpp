//WAP to demonstrate concept of pointer
#include <stdio.h>
#include <conio.h>
void main()
{
clrscr();
int x=100;
int * p;
p=&x;
printf("Value=%d\t Address =%u\n",x,&x); //by using variable
printf("Value=%d\t Address =%u\n",*p,p); //By using pointer
getch();
}
