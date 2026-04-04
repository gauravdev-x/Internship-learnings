//WAP to check given string is palindrome or not
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
char S[50];
int i,len,count=0;
printf("Enter the String to be checked :\n");
gets(S);
len=strlen(S);
for(i=0;i<len;i++)
{
if(S[i]!=S[len-(i+1)])
{
count=1;
break;
}
}
if(count==0)
{
printf("The String is palindrome");
}
else
{
printf("The String is NOT palindrome");
}
getch();
}