import java.util.Scanner;
class p2
{
public static void main(String [] args)
{
int x,y,sub;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number: ");
x=sc.nextInt();
System.out.print("Enter the second number: ");
y=sc.nextInt();
sub=x-y;
System.out.print("Enter subaction: "+sub);								
}
}