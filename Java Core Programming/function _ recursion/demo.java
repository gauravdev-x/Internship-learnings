/*WAP to demonstrate concept of static function*/
import java.util.*;
class demo
{
	static int add(int n1,int n2)
	{
		return(n1+n2);
	}
static public void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,b,sum;
System.out.println("Enter First and Second Number");
a=sc.nextInt();
b=sc.nextInt();
sum=add(a,b);
System.out.print("The Sum of two numbers is : "+sum);
}
}