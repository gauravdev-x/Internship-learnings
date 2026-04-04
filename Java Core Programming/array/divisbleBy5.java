/* WAP to find the number divisble by 5 in an array from 1 to 100*/

class divisbleBy5
{
	public static void  main(String args[])
	{
	 int i,j=0;
	 int a[]=new int[25];

	 for(i=1; i<101; i++)
	 {
	   if(i%5==0)
	   {
	     a[j]=i;
	     j++;
	   }
	 }

	 System.out.println("-------These Numbers are Divisible by 5-------");
	 for(i=0; i<j; i++)
	 {
	   System.out.print(a[i]+"     ");
	 }
	}
}