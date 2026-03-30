//WAP to display time and date of current using toString() 

import java.util.*;
class CurrentDate
{
	public static void main(String args[])
	{
	 Date date = new Date();

	System.out.printf("%s %tB %<te %<tY", "Due date:", date);			// display time and date using toString()
	//no suitable method found for println(String,String,Date) so can't use the println() here
	}
}

// born 5-07-2000
// current 23-12-2020
// 18 day 5 month 20 year.