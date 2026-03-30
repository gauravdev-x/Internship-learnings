class Rundog
{
public void bark()
{
System.out.println("Sheru...........");
System.out.println("Bho......Bho....");
}
}
class Bulldog extends Rundog
{
public void grawl()
{
System.out.println("Tuffy............");
System.out.println("Gurr....gurr.....");
}
}
class InDemo1
{
public static void main(String [] args)
{
Bulldog dog=new Bulldog();
dog.bark();
dog.grawl();
}
}










