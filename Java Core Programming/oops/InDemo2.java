import java.util.*;
class Shape
{
int s;//Instance variable
void setValue(int x)
{
s=x;
}
}
class Square extends Shape
{
int area()
{
return s*s;
}
}
class Cube extends Shape
{
int volume()
{
return s*s*s;
}
}
class InDemo2
{
public static void main(String [] args)
{
int x,a,v;
Scanner sc=new Scanner(System.in);
Square sq=new Square();
System.out.print("Enter side of square :");
x=sc.nextInt();
sq.setValue(x);
a=sq.area();
System.out.println("Area of square="+a);
Cube cu=new Cube();
System.out.print("Enter side of cube :");
x=sc.nextInt();
cu.setValue(x);
v=cu.volume();
System.out.println("Volume of cube="+v);
}
}


