/*Calculator ........Input using Buffered Reader*/

import java.io.*;

class Buff
{
	public static void main(String args[]) throws IOException
	{
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Two Number");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());

		System.out.println("Addition = "+(a+b));
		System.out.println("Substraction = "+(a-b));
		System.out.println("Multiplication = "+(a*b));
		System.out.println("Division = "+(a/b));
	}
}