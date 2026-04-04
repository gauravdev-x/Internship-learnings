//WAP to find the sum of two numbers using one variable

import java.util.Scanner;
class findSumUsingOneVar
{
public static void main(String [] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter First Number: ");
n=sc.nextInt();
System.out.print("Enter Second Number: ");
n=n+sc.nextInt();
System.out.println("Sum= "+n);
}
}; //here ':' is optional