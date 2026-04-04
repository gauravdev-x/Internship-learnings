import java.util.*;
class p28
{
public static void main(String [] args)
{
String sen,fw,rw;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sentence:");
sen=sc.nextLine();
System.out.print("Find what?");
fw=sc.nextLine();
System.out.print("Replace with:");
rw=sc.nextLine();
System.out.println("Modified sentence="+sen.replace(fw,rw));
}
}