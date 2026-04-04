//WAP to in java to print table of given n number.

import java.util.Scanner;
class p15
{
public static void main(String [] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number:");
n=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+(i*n));
}
}
}