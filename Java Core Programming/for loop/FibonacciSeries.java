/*
WAP to generate fibonacci series up to n terms,where the value of n is entered by user.
0 1 1 3 5 8 13..............n terms. 
*/
import java.util.Scanner;
class p13
{
public static void main(String [] args)
{
int n1=0,n2=1,n3,i,n;
Scanner sc=new Scanner(System.in);
System.out.print("How many terms you want in series?");
n=sc.nextInt();
System.out.println("***********Fibonacci Series*********");
System.out.print(n1+" " +n2+" ");
for(i=1;i<=n-2;i++)
{
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;
}
}
}