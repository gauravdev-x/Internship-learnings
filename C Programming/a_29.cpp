//WAP to create a function xstrcpy() to copy one string to another.
#include <stdio.h>
#include <conio.h>
void xstrcpy(char *,char *);  //Declaration of function
void main()
{
clrscr();
char str1[50],str2[50];
printf("Enter Source string : ");
gets(str1);
xstrcpy(str2,str1);
printf("Source String = %s\n",str1);
printf("Target String = %s\n",str2);
getch();
}
void xstrcpy(char *t, char *s)
{
while(*s!='\0')
{
*t=*s;
t++;
s++;
}
*t='\0';
}