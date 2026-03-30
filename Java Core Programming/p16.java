//WAP in java to find the prime number of given n number?.
import java.util.Scanner;
class p16
{
public static void main(String [] args)
{
int n,c=0,i=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
n=sc.nextInt();
while(i<=n)
{
if(n%i==0)
c++;
i++;
}
if(c==2)
System.out.print("Entered Number is prime no."+n);
else
System.out.print("Entered Number is not prime no."+n);
}
}