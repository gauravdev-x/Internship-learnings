import java.util.*;
class throwException
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter First Number: ");
  int x=sc.nextInt();
  try
   {
    System.out.print("Enter Second Number: ");
    int y=sc.nextInt();
    int div=x/y;
    System.out.print("Division= "+div);
    if(y==0)
     {
      System.out.println(" Not Possible Divide by Zero, It'll be infinte.\n");
     }
   }
  catch(ArithmeticException a)
   {
    System.out.print("Enter Second Number: ");
    int y=sc.nextInt();
    int div=x/y;
    System.out.print("Division= "+div);
   }
 }
}