class A
{
public void getA()
{
System.out.println("getA() Method of class A");
}
}

class B extends A
{
public void getA()
{
getA();
System.out.println("getA() method of class B");
}
}

class TestSuper
{
public static void main(String [] args)
{
B b=new B();
b.getA();
}
}