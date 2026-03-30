import java.util.*;
class DemoException
{
public static void main(String [] args)
{
try
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number :");
n=sc.nextInt();
System.out.println("Entered Number :"+n);
}
catch(Exception ex)
{
System.out.println("please enter only number");
}
finally
{
System.out.println("Option block :");
}
}
}