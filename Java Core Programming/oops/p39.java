
class Hello 
{
final int n;
public Hello(final int a)
{
n=a;
}
public void getNumber()
{
System.out.println("Number : "+n);
}
}
class Test
{
public static void main(String [] args)
{
Hello h=new Hello(10);
h.getNum();
}
}