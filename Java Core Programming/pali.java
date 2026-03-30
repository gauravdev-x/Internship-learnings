/*WAP  to check the given String is palindrome or not. */
import java.util.*;
class pali
{
public static void main(String args[])
{
String str,revstr="";
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String");
str=sc.nextLine();
for(i=str.length()-1;i>=0;i--)
{
	revstr+=str.charAt(i);
	
}
// System.out.println(revstr);
if(str.equalsIgnoreCase(revstr))
{
	System.out.println("The String is Palindrome");
}
else
{
	System.out.println("The String is not Palindrome");
}  
}
}