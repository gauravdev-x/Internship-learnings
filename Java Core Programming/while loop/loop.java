/*

Program to print series of even number from 1-100.

*/
class loop
{
	public static void main(String args[])
	{
		int i=1;
		System.out.println("Even Number from 1-100 are ");
		while(i<=100)
		{
			
			if(i%2==0)
			{
				
				System.out.print(i+"\t");
			}
			i++;
		}
	}
}