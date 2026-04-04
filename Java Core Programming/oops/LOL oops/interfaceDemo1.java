interface it1
{
void m1();
void m2();
}
class Testit1 implements it1
{
public void m1()
{
	System.out.println("This is m1() method ");
}
public void m2()
{
	System.out.println("The is m2() method");
}
}
class interfaceDemo1
{
	public static void main(String []args)
	{
		Testit1 obj=new Testit1();
		obj.m1();
		obj.m2();
	}	
}