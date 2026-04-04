/*WAP in java to print the short name of given full name.*/
import java.util.*;
class srt
{
public static void main(String args[])
{
String name;
String sname="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Full Name");
name=sc.nextLine();
String words[]=name.split(" ");
for(int i=0;i<words.length-1;i++)
{
	sname+=words[i].charAt(0)+".";
}
sname+=words[words.length-1];

//System.out.println("Full Name is "+ name);
System.out.println("Hello Mr " + sname);
}
}