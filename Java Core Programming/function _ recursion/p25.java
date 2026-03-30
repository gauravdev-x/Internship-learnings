//WAP to compare two string for equality.
import java.util.*;
class p25
{
public static void main(String [] args)
{
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first string:");
str1=sc.nextLine();
System.out.print("Enter second string:");
str2=sc.nextLine();
if(str1.equalsIgnoreCase(str2)==true)
{
System.out.println("Both string are equal");
}
else
{
System.out.println("Both strings are not equal");
}
}
}