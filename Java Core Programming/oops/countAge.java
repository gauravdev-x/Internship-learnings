
import java.util.*;
import java.text.SimpleDateFormat;

class DOB
{
	public void getAgeFromDOB(String dob)
	{
		//we get the input DOB in format dd--MM--yy
		String [] arr=dob.split("-");
		int userDate=Integer.parseInt(arr[0]);
		int userMonth=Integer.parseInt(arr[1]);
		int userYear=Integer.parseInt(arr[2]);
		
		DOB d=new DOB();	//current
		int currentDate=d.getDate();
		int currentMonth=d.getMonth()+1;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		int currentYear=Integer.();

		int agedate=0, agemonth=0; ageyear=0;

		if(userDate>currentDate)
		{
		currentDate=currentDate+30;
		currentMonth=currentMonth-1;
		}
		
		if(userMonth>currentMonth)
		 {
		  currentMonth=currentMonth+12;
		  currentYear=currentYear-1;
		 }
		System.out.println("Your Age is : ");
		System.out.print("Year : "+(currentYear-userYear));
		System.out.print("Month : "+(currentMonth-userMonth));
		System.out.print("Days : "+(currentDate-userDay));
	}	
}


class countAge
{
 public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter DOB in DD-MM-YYYY in Format: ");
   int x=sc.nextInt();
   int y=sc.nextInt();
   int Z=sc.nextInt();

   DOB date=new DOB();
   date.getAgeFromDOB(x,y,z);
 }
}