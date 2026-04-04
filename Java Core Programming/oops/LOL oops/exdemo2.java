import java.util.*;
class Exdemo2
{
	public static void main(String args[])
	{
		
		double a,b,div;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		div=a/b;
		System.out.println("Result is = "+div);
		}
		catch(InputMismatchException ex1)
		{
			System.out.println("Only Numbers are allowed");
		}
		catch(ArithmeticException ex2)
		{
			System.out.println("Unable to Divide by Zero");
		}
	}
	
}