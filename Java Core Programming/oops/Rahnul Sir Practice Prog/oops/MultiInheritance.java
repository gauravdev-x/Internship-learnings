interface MyMath
{
	void sum(int a, int b);	 //public abstract void sum();
	void sub(int a, int b);	 //public abstract void sub();
}


class Calc
{
	public void multi(int a, int b)
	{
	System.out.println("\nMultiplication= "+(a*b));
	}

	public void div(int a, int b)
	{
	System.out.println("\nDivision= "+(a/b));	
	}
}


class SimpleCalc extends Calc implements MyMath
{
	
	public void sum(int a, int b)
	{
	  System.out.println("\nSummation= "+(a+b));
	}
	
	public void sub(int a, int b)
	{
	  System.out.println("\nSubtraction= "+(a-b));
	}
}

class MultiInheritance
{
	public static void main(String[] args)
	{

	SimpleCalc cal=new SimpleCalc();
	cal.sum(100,20);
	cal.sub(100,20);
	cal.multi(100,20);
	cal.div(100,20);
	}

}