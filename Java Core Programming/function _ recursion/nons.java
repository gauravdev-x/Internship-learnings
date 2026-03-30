/*WAP to demostrate the concept of non-static function. */
import java.util.*;
class nons
{
	public static void main(String args[])
	{
		int l,b,h,volume;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length,Breath and Height ");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		nons obj =new nons();
		volume=obj.vol(l,b,h);
		System.out.println("Volume = "+volume);
	}
	int vol(int l,int b,int h)
	{
		return(l*b*h);
	}
}