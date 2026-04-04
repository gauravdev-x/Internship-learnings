import java.util.*;

class Rectangle
{
int length; //Instance Variable
int breadth; //Instance variable
Rectangle(int l,int b)
{
length=l;
breadth=b;
}
int area()
{
return (length*breadth);
}
int peri()
{
return 2*(length+breadth);
}
}
class ClassDemo3
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int x,y,a,p;
System.out.println("Enter length and breadth of rectangle");
x=sc.nextInt();
y=sc.nextInt();
Rectangle r=new Rectangle(x,y); // calling of constructor
a=r.area();
p=r.peri();
System.out.println("Area"+a);
System.out.println("perimeter="+p);
}
}