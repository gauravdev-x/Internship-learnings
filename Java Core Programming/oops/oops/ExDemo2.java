/*
Note:-For a single try block there can be multiple catch
*/
import java.util.*;
class ExDemo2
{
public static void main(String [] agrs)
{
int x,y,z;
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter two numbers :");
x=sc.nextInt();
y=sc.nextInt();
z=x/y;
System.out.println("Result="+z);
}
catch(InputMismatchException ex1)
{
System.out.println("Enter numbers only :");
}
catch(ArithmeticException ex2)
{
System.out.println("Are you try to/by zero?");
}
}
}









}