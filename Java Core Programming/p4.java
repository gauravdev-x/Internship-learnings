//WAP to find greatest number in two unequal number
import java.util.Scanner;
class p4
{
public static void main(String [] args)
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
x=sc.nextInt();
y=sc.nextInt();
if(x>y)
{
System.out.println("Greatest No="+x);
}
else
{
System.out.println("Greatest No="+y);
}
}
}
