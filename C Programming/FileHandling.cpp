//WAP to read information form file and display on screen.

#include<stdio.h>
#include<conio.h>

void main()
{
	clrscr();
	char filename[50];
	char ch;
	FILE *ptr;     //File pointer

	printf("Enter File Name to be Open: ");
	gets(filename);
	ptr=fopen(filename,"r");

	if(ptr==NULL)
	{
	 printf("File doesn't exist\n");
	 getch();
	 return;
	}

	ch=fgetc(ptr);

	while (ch!=EOF)				//EOF means end of file
	{
	 printf("%c",ch);
	 ch=fgetc(ptr);
	}
	 fclose(ptr);
	getch();
}