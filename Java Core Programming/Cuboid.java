//WAP to find volume and surface area of cuboid 

import java.util.Scanner;
class Cuboid
{
	public static void main(String [] args)
	{
	int l,b,h,vol,sa;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter lenght,breadth & height of Cuboid: ");
	l=sc.nextInt();
	b=sc.nextInt();
	h=sc.nextInt();
	vol=l*b*h;
	sa=2*(l*b+b*h+h*l);
	System.out.println("Volume of Cuboid = "+vol);
	System.out.println("Surface Area of Cuboid = "+sa);
	}
}