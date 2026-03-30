//WAP to Year count by Days

import java.util.Scanner;
class YearCounter
{
	public static void main(String [] args)
	{
	int years,weeks,days;
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter the Days: ");
	days=sc.nextInt();

	/*Conversion*/
	years=(days/365);   // Ignoring leap year

	weeks=(days%365)/7;
	
	days=days-((years*365)+(weeks*7));

	System.out.println("\n"+years+" Years, "+weeks+" Weeks, "+days+" Days");
	}
}