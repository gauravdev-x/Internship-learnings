/* WAP to create a function xstrlen() to find the length of string. */
#include <stdio.h>
#include <conio.h>
int xstrlen(char *);  //Declaration of function
void main()
{
clrscr();
char str[50];
int len;
printf("Enter a string : ");
gets(str);
len=xstrlen(str);   //calling of function
printf("The length of string=%d\n",len);
getch();
}
int xstrlen(char * s)
{
int n=0;
while(*s!='\0')
{
n++;
s++;
}
return n;
}