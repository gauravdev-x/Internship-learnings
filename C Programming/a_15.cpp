//WAP to find the length of string without built-in function.
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int i,count=0;
char S[50];
printf("Enter a String : ");
gets(S);
for(i=0;i<S[i]!='\0';i++)
{
count++;
}
printf("The length of string %s is %d ",S,count);
getch();
}