//GetprimeSeries(int min,int max)
import java.util.*;
class MyPro
{
public void getPrimeSeries(int min,int max)
{
for(int i=min; i<=max; i++)
{
	int c=0;
	for(int j=1; j<=i; j++)
	{
	if(1%j==0)
	c++;
	}

	if(c==2)
	System.out.print(i+"\t");
}
//dd-MM-yyyy
public void getAgeFromDOB(String dob)
{
String [] arr=dod.split("-");
int uday=Integer.parseInt(arr[0]);
int umonth=Integer,parseInt(arr[1]);
int uyear=Integer.parseInt(arr[2]);

Date d=new Date();
int cdate= d.getDate();
int cmonth=d.getMonth()+1;
int cyear=d.getyear();

int agedate=0.agemonth=0,ageyear=0;
if(uday>cdate)
{
cdate=cdate+30;
cmonth=cmonth-1;
}
if(umonth>cmonth)
{
cmonth=cmonth+12;
cyear=cyear-1;
}
System.out.print("Your age is :");
System.out.print("Year : "+(cyear-uyear));
System.out.print("Month : "+(cmonth-umonth));
System.out.print("Days : "+(cdate-uday));

}
}


class task12
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Min & Max Limit to Print the Prime Num: ");
int x=sc.nextInt();
int y=sc.nextInt();

MyPro m=new MyPro();
m.getPrimeSeries(x,y);
}
}
