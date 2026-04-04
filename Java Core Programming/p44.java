
class A
{
public void getA()
{
System.out.println("This method of class A");
}
}
class B extends A
{
public void getB()
{
System.out.println("This method of class B");
}
}
class In1
{
public static void main(String [] args)
{
//B b=new B();
//b.getA(); //classA
//b.getB(); //classB
A a=new B();
a.getA();
a.getB();
}
}








