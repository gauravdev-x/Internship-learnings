//word counter
import java.util.*;
class str3
{
public static void main(String []args)
{
String sen;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Sentence");
sen=sc.nextLine();
String words[]=sen.split(" ");
System.out.println("Number of words in Sentence = "+words.length);
}
}
