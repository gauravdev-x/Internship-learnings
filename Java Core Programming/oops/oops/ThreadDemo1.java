//WAP to create a thread by extending 'Thread' class

class Thread1 extends Thread
{

 public void run()
 {
  for(int i=0;i<=50;i++)
  {
   System.out.println(i);
  }

 }
}

class ThreadDemo1
{
 public static void main(String[] args)
 {
  Thread1 th=new Thread1();
  th.start();

  for(int i=1;i<=20;i++)
   System.out.println("Main "+i);

 }
}