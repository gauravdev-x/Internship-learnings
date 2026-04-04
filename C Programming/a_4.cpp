//WAP to write information into the file
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
clrscr();
int rollno;
char name[50];
long fee;
FILE *ptr; 		//File pointer
printf("Enter Student Id : ");
scanf("%d",&rollno);
fflush(stdin);
printf("Enter Student Name : ");
gets(name);
printf("Eneter Student fee : ");
scanf("%ld",&fee);
ptr=fopen("student.txt","a");
fprintf(ptr,"Student Roll No =%d\n",rollno);
fprintf(ptr,"Student Name =%s\n",name);
fprintf(ptr,"Student fee=%ld\n",fee);
fclose(ptr);
printf("Data is saved in file\n");
getch();
}