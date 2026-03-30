//WAP to print current date

import java.util.Date;
import java.text.SimpleDateFormat;

class dateFormat
{
	public static void main(String [] args)
	{

	Date date=new Date();
	//System.out.print(date);

	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm::ss a");
	sdf.format(date);

	String str=sdf.format(date);

	System.out.println(str);
	}
}
