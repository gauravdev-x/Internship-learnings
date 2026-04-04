//WAP to check given string is palindrome or not.
import java.util.*;
class p27
{
public static void main(String [] args)
{
String str,revstr="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string");
str=sc.nextLine();
int i;
for(i=str.length()-1;i>=0;i--)
{
revstr=revstr+str.charAt(i);
}
System.out.println("Reverse string="+revstr);
if(str.equalsIgnoreCase(revstr)==true)
{
System.out.println("String is palindrome ");
}
else
{
System.out.println("String is not palindrome ");
}
}
}