
import java.util.*;

class exception
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);

  try
   {
    System.out.print("Enter First Number: ");
    int x=sc.nextInt();
   }
  catch(InputMismatchException a)
   {
    System.out.print("(Please Enter Numbers Only)\n"+a+"\n");
   }
  finally
   {
    System.out.println("\nIt's the Finally Block Code, & It's the Optional");
    System.out.print("If You Use the 'finally' in Your Code then It'll Execute Anyway\n");
   }
  



 }

} 