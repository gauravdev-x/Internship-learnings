import java.util.*;
class p35
{
public static void main(String [] args)
{
String str;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any string :");
str=sc.nextLine();
str=str.toUpperCase().replace("","");
for(int i=0;i<str.length();i++)
{
sum=sum+(str.charAt(i)-64);
}
System.out.print("sum of string Character :"+sum);
}
}
