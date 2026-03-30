/*WAP to compare two strings for equality*/
import java.util.*;
class str2
{
public static void main(String args[])
{
String strr1,strr2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First String");
strr1=sc.nextLine();
System.out.println("Enter Second String");
strr2=sc.nextLine();
if(strr1.equalsIgnoreCase(strr2))   
//equals is used to compare case sensitivity also.
{
System.out.println("Both the Strings are equal");
}
else
{
System.out.println("Both are Different Strings");
}
}
}