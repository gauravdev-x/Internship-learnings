// WAP to count the years in given days.
import java.util.Scanner;
class p23
{
public static void main(String [] args)
{
int days,years,weeks;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Number of days:");
days=sc.nextInt();

years=days/365;
weeks=(days%365)/7;
days=days-((years*365)+(weeks*7));

System.out.print(years+"years,");
System.out.print(weeks+"years,");
System.out.print(days+"days");
}
}