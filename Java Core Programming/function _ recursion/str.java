import java.util.*;
class str1
{
public static void main(String args[])
{
String name;
Scanner sc =new Scanner(System.in);
System.out.print("Enter a name : ");
name=sc.nextLine();
System.out.print("\nName in UpperCase : "+name.toUpperCase());
System.out.print("\nName in LowerCase : "+name.toLowerCase());
System.out.print("\nLength of the Name : "+name.length());
}
}