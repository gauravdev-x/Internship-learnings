//use of 'super' keyword

class SuperA
{
 public void getA()
 {
  System.out.println("\ngetA() method of class SuperA");
 }
}

class SuperB extends SuperA
{

 @Override
 public void getA()
 {
//getA();
//using getA() we can call the self function(recursion) means method 

  super.getA();	// 'super.getA()' is calling method 'getA()' of class SuperA

  System.out.println("getA() method of class SuperB");
 }
}

class SuperKeyword
{
 public static void main(String[] args)
 {

  SuperB obj=new SuperB();
  obj.getA();
  
 }
}