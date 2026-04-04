import java.util.*;
class oddeven
{
public static void main(String args[])
{
	int a[]=new  int [20];
	int ev[]=new  int [20];
	int od[]=new  int [20];
	int i,e,o,esum,osum;
	e=0;
	o=0;
	esum=0;
	osum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 20 numbers");
	for(i=0;i<20;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<20;i++)
	{
		if(a[i]%2==0)
		{
			ev[e]=a[i];
			e++;
		}
		else
		{
			od[o]=a[i];
			o++;
		}
	}
for(i=0;i<e;i++)
{
	esum+=ev[i];
}
for(i=0;i<o;i++)
{
	osum+=od[i];
}
System.out.println("The Even numbers are :- ");
for(i=0;i<e;i++)
{
	System.out.println(ev[i]+"\t");
}
System.out.println("The Odd numbers are :- ");
for(i=0;i<o;i++)
{
	System.out.println(od[i]+"\t");
}
System.out.println("Sum of even numbers is = "+esum);
System.out.println("Sum of odd numbers is = "+osum);

}
}