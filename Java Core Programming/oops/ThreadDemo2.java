//WAP to create a thread by implementing Runnable interface

import java.util.*;
class Thread2 implements Runnable
{
public void run()
{
for(int i=1;i<=50;i++)
{
System.out.println(i);
}
}
}

class ThreadDemo2
{
public static void main(String [] args)
{
Thread2 t=new Thread2();
Thread th=new Thread(t);
th.start(); 
for(int i=1;i<=20;i++)
{
System.out.println("Main :"+i);
}
}
}