//Runnable interface is pre-defined in java.lang package 

class threadInterfaceA implements Runnable
{
 @Override
 public void run() //'run()' is method of interface
 {
  System.out.println("\nStart of ThreadInterfaceA Class");
  for(int i=1; i<=7; i++)
   {
    System.out.println("\nClass ThreadInterfaceA "+i);
   }
  System.out.println("\nEnd of ThreadInterfaceA Class");
 }
}


class threadInterfaceB implements Runnable
{
 @Override
 public void run()
 {
  System.out.println("\nStart of ThreadInterfaceB Class");
  for(int i=1; i<=7; i++)
   {
    System.out.println("\nClass ThreadInterfaceB "+i);
   }
  System.out.println("\nEnd of ThreadInterfaceB Class");
 }
}


class threadUsingRunnable
{
 public static void main(String[] args)
 {

  Thread th1=new Thread(new threadInterfaceA());    
  Thread th2=new Thread(new threadInterfaceB());    
  th1.start();
  th2.start();

 }
}