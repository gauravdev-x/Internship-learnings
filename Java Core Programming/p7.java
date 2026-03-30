//WAP to check input number is Evne or odd
import java.util.Scanner;
class p7
{
public static void main(String [] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number: ");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Number is Even");
}
else
{
System.out.println("Number is Odd");
}
}
}