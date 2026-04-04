import java.util.*;
class ExDemo3
{
public static void main(String args[])
{
int x[] =new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 Numbers");
for(i=0;i<5;i++)
{
x[i]=sc.nextInt();
}
System.out.println("You have Entered Following Numbers ");
try
{
for(i=0;i<=5;i++)
{
System.out.println(x[i]);
}
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("End of Array");
}
}
}