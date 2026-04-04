/*This program will describe method overloading*/
import java.util.*;
class figure
{
int area(int a)
{
return(a*a);
}
int area(int l,int b)
{
return(l*b);
}
double area(float r)
{
return(3.1416*r*r);
}
}
class overloadingDemo
{
public static void main(String args[])
{
int s,l,b,sa,ra;
float r;
double ca;
Scanner sc=new Scanner(System.in);
figure obj= new figure();
System.out.println("Enter the side of square");
s=sc.nextInt();
System.out.println("Enter the length and breadth of rectange");
l=sc.nextInt();
b=sc.nextInt(); 
System.out.println("Enter the radius of circle");
r=sc.nextFloat();
sa=obj.area(s);
ra=obj.area(l,b);
ca=obj.area(r);
System.out.println("Area of Square = "+sa+"\nArea of Rectangle = "+ra+"\nArea of Circle = "+ca);
}
}