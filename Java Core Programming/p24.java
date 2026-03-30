import java.util.*;
class p24
{
public static void main(String [] args)
{
String name;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name:");
name=sc.nextLine();
System.out.println("Name is uppercase="+name.toUpperCase());
System.out.println("Name is lowercase="+name.toLowerCase());
System.out.println("Length of name="+name.length());
}
}