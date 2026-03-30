interface MyMath
{
	void sum(int a, int b);
	void sub(int a, int b);
}

class Calc
{
	public void multi(int a, int b)
	{
	System.out.println("Mult= "+(a*b));
	}

	public void div(int a, int b)
	{
	System.out.println("Div= "+(a/b));
	}
}

class SimpleCalc extends Calc implements MyMath
{
	@Override
	public void sum(int a,int b)
	{
	System.out.println("Sum="+(a+b));
	}

	public void sub(int a,int b)
	{
	System.out.println("Sub="+(a-b));
	}
}

class MultInheritance
{
	public static void main(String [] args)
	{
	SimpleCalc cal=new SimpleCalc();
	cal.sum(100,20);
	cal.sub(100,20);
	cal.multi(100,20);
	cal.div(100,20);
	}
}
