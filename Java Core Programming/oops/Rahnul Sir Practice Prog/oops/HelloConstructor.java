//constructor

class HloCont
{
final int n;

public HloCont(final int a)
{
n=a;
}

public void getNum()
{
System.out.println("Number: "+n);
}
}

class HelloConstructor
{
public static void main(String [] args)
{

HloCont h=new HloCont(10);

h.getNum();

}
}