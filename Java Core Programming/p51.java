import java.util.*;
class DemoException
{
public static void main(String []args) 
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the frist Number :");
a=sc.nextInt();
System.out.println("Enter Second Number :");
b=sc.nextInt();
if(b==0)
{
throw new ArithmeticException("zero is not valid");
}
else
{
int d=a/b;
System.out.println("Div ="+d);
}
}