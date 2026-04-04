//WAP to check number is armstrong or not

import java.util.*;
class Armstrong
{
	int arms(int num)
	{	
	  int r,sum=0;
	  while(num>0)
	  {
	    r=num%10;
	    sum+=(r*r*r);
	    num=num/10;
	  }
	   return (sum);
	}

	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 Armstrong obj=new Armstrong();

	 System.out.print("Enter a number : ");
	 int n=sc.nextInt();
	 int sum=obj.arms(n);

	 if(n==sum)
	 {
	   System.out.println(n+" is a Armstrong Number");
	 }
	 else
	 {
	   System.out.println(n+" is not a Armstrong Number");
	 }
	}
}