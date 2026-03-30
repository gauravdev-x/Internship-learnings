//WAP to find area and perimeter of rectangle.
import java.util.Scanner;
class p3
{
public static void main(String args[])
{
int l,b,area,peri;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length");
l=sc.nextInt();
System.out.println("Enter Bread
th");
b=sc.nextInt();
area=l*b;
peri=2*(l+b);
System.out.println("Area = "+area +"\nPerimeter = "+peri);
}
}