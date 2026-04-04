//thread by using 'Thread' class

class threadA extends Thread
{
 @Override
 public void run()
 {
  try
  {
   System.out.println("\nStart of threadA Class");
   for(int i=1; i<=5; i++)
    {
     System.out.println("\nthreadA "+i);
     sleep(1000);
    }
   System.out.println("\nEnd of threadA Class");
  }
  catch(Exception a){}
 }
}

class threadB extends Thread
{
 @Override
 public void run()
 {
  System.out.println("\nStart of threadB Class");
  for(int i=1; i<=9; i++)
   {
    System.out.println("\nthreadB "+i);
   }
   System.out.println("\nEnd of threadB Class");
 }
}

class threadUsingthreadClass
{
 public static void main(String[] args)
 {

  threadA thA=new threadA();
  thA.start();
  threadB thB=new threadB();
  thB.start();

 }
}