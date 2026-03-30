
class A implements Runnable

{
public void run()
{
System.out.println("Start Class A");
for(int i=1;i<=20;i++)
{
System.out.println("Class A =>"+i);
}
System.out.println("End class A");
}
}

class B implements Runnable
{
public void run()
{
System.out.println("Start Class B");
for(int i=1;i<=20;i++)
{
System.out.println("Class B => "+i);
}
System.out.println("End Class B");
}
}

class TestThread
{
public static void main(String [] args)
{

Thread t1=new Thread(new A());
Thread t2=new Thread(new B ());
t1.start();
t2.start();
}
}