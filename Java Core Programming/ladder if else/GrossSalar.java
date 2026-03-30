//WAP to 

import java.util.Scanner
class GrossSalary
{
	public static void main(String [] args)
	{
	double bs,gs;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter basic salary:");
	bs=sc.nextDouble();
	
		if(bs<=4000)
		gs=bs+(bs*10)/100+(bs*50)/100);
		
		esle if(bs>4000 && bs<=8000)
		gs=bs+(bs*20)/100+(bs*60)/100;
	
		else if(bs>8000 && bs<=12000)
		gs=bs+(bs*25/100+(bs*70)/100;
	
		else
		gs=bs+(bs*30)/100+(bs*80)/100;
	
	system.out.println("Gross Salary="+gs);
	}
} 
