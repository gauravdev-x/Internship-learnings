import java.util.*;
class shape
{
int s;
public void setValue(int x)
{
s=x;
}
}
class square extends shape
{
int area()
{
return s*s;
}
}
class cube extends shape
{
int volume()
{
return s*s*s;
}
}
class indemo2
{
public static void main(String args[])
{
int x,a,v;
Scanner sc=new Scanner(System.in);
square obj1=new square();
cube obj2=new cube();
System.out.println("Enter the value of side of square");
x=sc.nextInt();
obj1.setValue(x);
a=obj1.area();
System.out.println("Enter the value of side of cube");
x=sc.nextInt();
obj2.setValue(x);
v=obj2.volume();
System.out.println("Area is "+a+"\nVolume is "+v);
}
}




