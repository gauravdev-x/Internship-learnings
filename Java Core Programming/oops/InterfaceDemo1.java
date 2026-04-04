interface it1
{
void m1();
void m2();
}
class TestIt1 implements it1
{
public void m1()
{
System.out.println("This is m1() method");
}
public void m2()
{
System.out.println("This is m2() method");
}
}
class InterfaceDemo1
{
public static void main(String [] args)
{
TestIt1 t=new TestIt1();
t.m1();
t.m2();
}
}






