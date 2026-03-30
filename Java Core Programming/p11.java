//Currency Convertor
import java.util.Scanner;
class p11
{
public static void main(String [] args)
{
int ch;
Double d,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for d to r");
System.out.println("Enter 2 for r to d");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.print("Enter currency in dollar:");
d=sc.nextDouble();
r=d*70;
System.out.println("Currency in rupees="+r);
break;
case 2:
System.out.println("Enter currency in rupees:");
r=sc.nextDouble();
d=r/70;
System.out.println("Currency in doller="+d);
break;
default:
System.out.println("Invalid choice");
}
}
}