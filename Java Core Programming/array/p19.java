//WAP to store five number in array then print those number.
import java.util.*;
class p19
{
public static void main(String [] args)
{
int [] x=new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter five numbers in an array");
for(i=0;i<5;i++)
{
x[i]=sc.nextInt();
}
System.out.println("You have entered following numbers");
for(int n:x)
{
System.out.println(n);
}
}
}
