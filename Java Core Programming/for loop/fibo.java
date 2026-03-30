/*WAP ro genrate fibonacci series up to n term, where the value of n is entered by user*/
import java.util.Scanner;
class fibo
{
public static void main(String args[])
{
int n,f,l,res;
f=0;
l=1;
Scanner somya=new Scanner(System.in);
System.out.println("Enter the terms in Fibonacci Series");
n=somya.nextInt();
System.out.print("Series is \n"+"0\t 1\t");
for(int i=3;i<=n;i++)
{
	res=f+l;
	f=l;
	l=res;
	System.out.print(res+"\t");

}
}
}