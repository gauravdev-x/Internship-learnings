import java.util.Scanner;
class Sub
{
	public static void main(String [] args)
	{
	int x,y,sub;

	Scanner sc=new Scanner(System.in);

	System.out.print("Enter First Number: ");
	x=sc.nextInt();

	System.out.print("Enter Second Number: ");
	y=sc.nextInt();

	sub=x-y;

	System.out.print("Subtraction= "+sub);								
	}
}