class Calc
{
private int a;
private int b;
public void sum()
{
System.out.print("Sum ="+(a+b));
}
public void setA(int a)
{
this.a=a;
}
public void setB(int b)
{
this.b=b;
}
}

class TestCalc47
{
public static void main(String [] args)
{
Calc c=new Calc();
c.setA(10);
c.setB(20);
c.sum();
}
}