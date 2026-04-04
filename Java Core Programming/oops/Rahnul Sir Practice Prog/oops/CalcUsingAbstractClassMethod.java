//demo of abstract class & methods/functions

import java.util.*;
abstract class CalcUsingAbstractClassWithAbstractMethod
{
 public abstract void sum(int a, int b);
 public abstract void sub(int a, int b);

 public void multi(int a, int b)
 {
  System.out.println("\n Multiplication= "+(a*b));
 }

 public void div(int a, int b)
 {
  System.out.println("\n Division= "+(a/b));
 }
}

class AbstractMethodInherit extends CalcUsingAbstractClassWithAbstractMethod
{
 public void evenOdd(int n)
 {
  if (n%2==0)
   System.out.println("\n "+n+" is Even Number");
  else
   System.out.println("\n "+n+" is Odd Number");
 }

 public void sub(int a, int b)
 {
  System.out.println("\n Summation= "+(a+b));
 }

 public void sum(int a, int b)
 {
  System.out.println("\n Subtraction= "+(a-b));
 }
}

class CalcUsingAbstractClassMethod
{
 public static void main(String[] args)
 {
  //Scanner sc=new Scanner(System.in);

  //System.out.print("\nEnter the 2 Numbers: ");
  //int x=sc.nextInt();
  //int y=sc.nextInt();
  	  
  //System.out.print("\nEnter a Number to Check Even or Odd: ");
  //int n=sc.nextInt();

  AbstractMethodInherit objvar=new AbstractMethodInherit();
		
  objvar.evenOdd(9);
	
  objvar.sum(10,20);

  objvar.sub(20,10);

  objvar.multi(10,15);
	
  objvar.div(20,10);

 }
}