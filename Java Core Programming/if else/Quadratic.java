/*WAP to find the roots of quaratic equation ax2 +bx +c=0*/

import java.util.Scanner;

class Quadratic
{
	public static void main(String [] args)
	{
	int r1,r2,sum;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Value of a,b,c of the Quadratic Equation: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	sum=(b*b)-4*a*c;

	  if(sum<0)
	  {
	 System.out.println("\nRoots are Imaginary OR Roots are not Possible");
	  }
	  else
	  {
	  r1=(-b+sum)/(2*a);
	  r2=(-b-sum)/(2*a);
	 System.out.println("\nRoots are "+r1+" "+r2);
	  }
	}
}