/*WAP to find ther length of string using user defined function
(use the concept of call by reference.)*/

#include<stdio.h>
#include<conio.h>

int strlenx(char *);

void main()
{
	clrscr();
	char S[100];
	printf("Enter the String: ");
	gets(S);
	int l=strlenx(S);
	printf("The Length of String: %d",l);
	getch();
}

int strlenx(char *X)
{
	int a=0;
	while(*X!='\0')
	{
	 a++;
	 X++;
	}
return a;
}