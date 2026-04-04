//WAP to use Array of Structure Variables.
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct student
{
int rollno;
char name[50];
long fee;
};
struct student s[3];  // 's' is the Array of structure variables
void main()
{
clrscr();
int i;
printf("Enter the Student's Details\n\n");
for(i=0;i<3;i++)
{
printf ("Enter details of Student %d\n",(i+1));
printf("Enter the Roll no : ");
scanf("%d",&s[i].rollno);
fflush(stdin);
printf("Enter name of the Student : ");
gets(s[i].name);
printf("Enter Fees : ");
scanf("%ld",&s[i].fee);
}
clrscr();
//Print the Details of Students

printf("Details of Students \n\n");
for(i=0;i<3;i++)
{
printf("Details of Student : %d\n",(i+1));
printf("Roll Number=%d\n",s[i].rollno);
printf("Student Name=%s\n",s[i].name);
printf("Student Fees=%ld\n",s[i].fee);
}
getch();
}

