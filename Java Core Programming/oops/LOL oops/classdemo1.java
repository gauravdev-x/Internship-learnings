
import java.util.*;

class myclass
{
String name;		//Instance Variable
void setName(String uname)
{
name=uname;
}
void display()
{
System.out.println("Hello "+name+" G");
}
}
class demo
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
myclass obj=new myclass();
String n;
System.out.println("Enter you Name");
n=sc.nextLine();
obj.setName(n);
obj.display();
}
}