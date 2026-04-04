
class Calc
{

private int a,b;	//class/instance variable

public Calc(int a, int b)	//parameter variable
//we can pass the same name variable
{
this.a=a;	//this is the keyword which represent the class/instance variable
this.b=b;
}

public void sum()
{
System.out.println("Sum = "+(a+b));
}

public void sub()
{
System.out.println("Sub = "+(a-b));
}

public void multi()
{
System.out.println("Multi = "+(a*b));
}

public void div()
{
System.out.println("Division = "+(a/b));
}

}

class SimCalcUsingConstructor
{
public static void main(String [] args)
{

Calc cal=new Calc(200,50);
cal.sum();
cal.sub();
cal.multi();
cal.div();

}

}