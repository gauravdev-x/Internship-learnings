class Calc
{
private int a;
private int b;
public void sum()
{
System.out.println("Sum ="+(a+b));
}

//setter
public void setA(int a)
{
this.a=a;
}
public void setB(int b)
{
this.b=b;
}

//getter
public int getA()
{
return a;
}
public int getB()
{
return b;
}
}

class TestCalc48
{
public static void main(String [] args)
{
Calc c=new Calc();
c.setA(10);
c.setB(20);
c.sum();
System.out.println("A= "+c.getA());
System.out.println("B= "+c.getB());
}
}