class A
{
public void m1()
{
System.out.println("m1 of A");
}
void m2()
{
System.out.println("m2 of A");
}
}
class B extends A
{
public void m1()
{
System.out.println("m1 of B");
}
void m3()
{
System.out.println("m3 of B");
}
}
class overridingDemo
{
public static void main(String args[])
{
A obj1= new A();
B obj2= new B();
obj1.m1();
obj1.m2();
obj2.m1();
obj2.m2();
obj2.m3();
}
}