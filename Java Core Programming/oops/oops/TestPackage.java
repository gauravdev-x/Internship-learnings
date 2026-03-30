import java.util.Scanner;
import mypack.MyUtil;
class TestPackage
{
public static void main(String [] args)
{
int x,y,s,g;
Scanner sc=new Scanner(System.in);
MyUtil mu=new MyUtil();
System.out.println("Enter two number");
x=sc.nextInt();
y=sc.nextInt();
s=mu.add(x,y);
g=mu.greatest(x,y);
System.out.println("Sum="+s);
System.out.println("Greatest="+g);
}
}