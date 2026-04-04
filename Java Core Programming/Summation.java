import java.util.Scanner;
class Summation
{
	public static void main(String [] args)
	{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter First Number: ");
	a=sc.nextInt();

	System.out.print("Enter Second Number: ");
	b=sc.nextInt();
	sum=a+b;

	System.out.println("Summation= "+sum);
	}
}
