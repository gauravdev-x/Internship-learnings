abstract class calculator
{
 public abstract void sum(int a,int b);
 public abstract void sub(int a,int b);
 public void multi(int a,int b)
	{
	System.out.println("Multiply = "+(a*b));
	}
 public void div(int a,int b)
	{
	System.out.println("Div = "+(a/b));
	}
}
class operation extends calculator
{
public void evenodd(int n)
{
if(n%2==0)
System.out.println("Number is Even : "+n);
else
System.out.println("Number is Odd : "+n);
}
public void sum(int a ,int b)                {}
public void sub(int a ,int b){}
}
class testAbstract
{
	public static void main(String args[])
	{
	 operation obj=new operation();
	 obj.evenodd(8);
	 obj.sum(100,200);
	 obj.sub(100,200);
	 obj.multi(100,200);
	 obj.div(100,200);
	}
}