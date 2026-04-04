//WAP to count sum of alphbets like resoning

import java.util.*;
class reasoningTest
{
public static void main(String [] args)
{
String str;
int sum=0;
Scanner sc=new Scanner(System.in);

System.out.print("Enter the String: ");
str=sc.nextLine();
	
str=str.toUpperCase().replace(" ","");	//here by using replace() we replace the 'space' with 'empty'
	
for(int i=0;i<str.length();i++)
{	
sum=sum+(str.charAt(i)-64);
}

System.out.print("Sum of String: "+sum);
	
}
}