import java.util.*;
class prime
{
public void getPrimeSeries(int min,int max)
{
for(int i=min; i<=max; i++)
{
	int c=0;
	for(int j=1; j<=i; j++)
	{
		if(i%j==0)
		c++;
	}
		if(c==2)
		{
		System.out.print(i+"\t");
		}
}
}
}
class primeNumberUsingClass
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter Min & Max Limit to Print Num: ");
int x=sc.nextInt();
int y=sc.nextInt();

prime num=new prime();
num.getPrimeSeries(x,y);
}

}