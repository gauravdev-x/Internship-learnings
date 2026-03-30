abstract class Calculator
{
	public abstract void sum(int a,int b);
	public abstract void sub(int a,int b);

	public void mult(int a,int b)
	{
	System.out.println("Mult ="+(a*b));
	}

	public void div(int a, int b)
	{
	System.out.println("Div ="+(a/b));
	}
}

class Operation extends Calculator
{
	public void evenodd(int n)
	{
	if(n%2==0)
	System.out.println("Number in Even :"+n);
	else
	System.out.println("Number is Odd :"+n);
	}
	
	@Override
	public void sub(int a,int b)
	{
	System.out.println("Sub ="+(a-b));
	}
	
	@Override
	public void sum(int a,int b)
	{
	System.out.println("Sum ="+(a+b));
	}
}

class TestAbstract
{
	public static void main(String [] agrs)
	{
	Operation p=new Operation();
	p.evenodd(7);
	p.sum(100,20);
	p.sub(100,20);
	p.mult(100,20);
	p.div(100,20);
	}
}










