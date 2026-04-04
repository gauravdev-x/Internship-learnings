/* WAP to take userid and password as input, then show the userid and password on the screen ,during password input the astrisk(*) should be show on screen. */
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
char userid[20],password[10];
char ch;
int i;
printf("Enter User Id : ");
gets(userid);
printf("Enter password not more than 10 character : ");
for(i=0;i<10;i++)
{
ch=getch();
if(ch==13)
{
break;
}
password[i]=ch;
ch = '*';
printf("%c",ch);
}
password[i]='\0';
printf("\nUser Id : %s\n",userid);
printf("password : %s\n",password);
getch();
}