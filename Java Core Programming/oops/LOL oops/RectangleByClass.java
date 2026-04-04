import java.util.*;
class Rectangle
{
	int l;	int b;
	rectangle(int length, int breadth)
	{
	l=length;	b=breadth;
	}

	int area() {
	return(l*b); }

`	int peri() {
	return(2*(l+b)); }
}

class RectangleByClass
{
	public static void main(String args[]);
	{
	int x,y,a,p;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and breadth of rectangle");
	x=sc.nextInt();
	y=sc.nextInt();
	rectangle obj=new rectangle(x,y);	//calling of constructor
	a=obj.area();
	p=obj.peri();
	System.out.println("Area = "+a+"\nPerimeter"+p);
	}
}