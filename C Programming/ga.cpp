include<stdio.h>
include<conio.h>
void fun(int x, int *y)
x++;
*y=x+x
main()
{
int b=4,a=1;
fun(3,&b);
printf("&%d%d",a,b);
getch();
}