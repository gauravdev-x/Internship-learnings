import java.util.*;
class MyClass
{
String name; // Instance variable
void setName(String uname)
{
name=uname;
}
void display()
{
System.out.println("Hello"+name);
}
}
class ClassDemo1
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
MyClass m=new MyClass();
String n;
System.out.print("Enter your name :");
n=sc.nextLine();
m.setName(n);
m.display();
}
}