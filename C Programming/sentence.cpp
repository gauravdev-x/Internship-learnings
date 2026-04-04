//WAP to take a sentence as input and count thr words in sentence.
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
char sen[100];
int i,wc=0;
printf("Enter a sentence\n");
gets(sen);
for(i=0;i<strlen(sen);i++)
{
if(sen[i]==' ')
{
wc++;
}
}
printf("Total number of words in sentence is %d \n",(wc+1));
getch();
}