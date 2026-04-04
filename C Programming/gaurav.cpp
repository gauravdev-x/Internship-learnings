#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void main()
{
struct student
{
int sturollno;
char stuname;
int stumark;

};
int i;
clrscr();
struct student st[4];
printf("student detail\n");
for(i=0;i<=3;i++)
{
printf("enter the student roll no");
scanf("%d",&st[i].sturollno);
fflush(stdin);
printf("enter the student name");
scanf("%s",&st[i].stuname);
printf("enter the stumark");
scanf("%d",&st[i].stumark);
printf("student detail\n");
}
for(i=0;i<=3;i++)
{
printf("student roll no=%d\n student name=%s\n student mark=%d\n",st[i].sturollno,st[i].
stuname,st[i].stumark);
}
getch();
}
