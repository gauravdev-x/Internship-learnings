class barkdog
{
public void bark()
{
System.out.println("Sheruuu.............");
System.out.println("Bho....Bhooo....bhhhh0oooooooo");
}
}

class bulldog extends barkdog
{
public void grawl()
{
System.out.println("Markyyyyyyyyyyy.............");
System.out.println("ggggguuuuuuuuurrrrrrrrrrrrrrr");
}
}
class indemo1
{
public static void main(String args[])
{
bulldog obj=new bulldog();
obj.bark();
obj.grawl();
}
}