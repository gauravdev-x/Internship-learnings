class A extends Thread
{
public void run()
{
try
{
System.out.println("Start Class A");
for(int i=0;i<=10;i++)
{
System.out.println("A=>"+i);
sleep(2000);
}
System.out.println("End class A");
}
catch(Exception ex)
{
//blank
}
}
}

class B extends Thread
{
public void run()
{
System.out.println("Start Class B");
for(int i=0;i<=10;i++)
{
System.out.println("B=>"+i);
}
System.out.println("End class B");
}
}

class TestT2
{
public static void main(String [] args)
{
A a=new A();
B b=new B();
a.start();
b.start();
}
}
