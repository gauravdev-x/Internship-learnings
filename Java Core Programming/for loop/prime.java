/*WAP in JAVA to find the prime number of given n*/
import java.util.Scanner;
class prime
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n,i,count=1;
System.out.println("Enter any Number");
n=sc.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
{
count=0;
}
}
if(count==1)
{
System.out.println("This is a Prime Number");
}
else
{
System.out.println("This is not a Prime Number");
}
}
}