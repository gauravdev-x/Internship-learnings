//WAP in java tp find the greatest number of given three numbers.
import java.util.Scanner;
class p9
{
public static void main(String [] args)
{
int a,b,c;
System.out.print("Enter three Number:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("Greatest Number"+a);
}
else if(b>a && b>c)
{
System.out.println("Greatest Number"+b);
}
else
{
System.out.println("Greatest Number"+c);
}
}
}