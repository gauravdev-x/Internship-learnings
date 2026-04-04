//here creating sub package

package mypack.subpackage;

public class sub
{
 	public void table(int a)
	{
	 System.out.print("Table of "+a+"\n");

	 for(int i=1; i<=10; i++)
	  {
	   int t=a*i;
	   System.out.println(t);
          }
	}
}