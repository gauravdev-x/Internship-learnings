//WAP to convert given number of days to a measure of time given in years, week and days. For examples 375 days is equal to 1 year 1 week and 3 days (ignore leap year).
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int num,year,week,day;
printf("Enter the days to be converted : ");
scanf("%d",&num);
year= num/365;
week= (num%365)/7;
day = num- ((year*365) + (week*7));
printf("%d days are equal to %d years %d weeks and %d days ",num,year,week,day);
getch();
}