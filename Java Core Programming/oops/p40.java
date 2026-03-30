class Calc
{
private int a,b;  //class instance variable
public Calc(int a,int b) //private instance variable
{
this.a=a; // this is the keybord which
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
public void mult()
{
System.out.println("Mult = "+(a*b));
}
public void div()
{
System.out.println("div = "+(a/b));
}
}
class Test2
{
public static void main(String [] args)
{
Calc cal=new Calc(100,20);
cal.sum();
cal.sub();
cal.mult();
cal.div();
}
}
