//Currency Convertor

import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String [] args)
	{
	 Double d,r;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 1 for Dollar to INR");
	 System.out.println("Enter 2 for INR to Dollar");
	 int ch=sc.nextInt();

	 switch(ch)
	 {
	 case 1:
	 System.out.print("Enter Currency in Dollar:");
	 d=sc.nextDouble();
	 r=d*70;
	 System.out.println("Currency in INR="+r);
	 break;
	 case 2:
	 System.out.println("Enter Currency in INR:");
	 r=sc.nextDouble();
	 d=r/70;
	 System.out.println("Currency in Dollar="+d);
	 break;
	 default:
	 System.out.println("Invalid Choice");
	 }
	}
}