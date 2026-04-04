//WAP to store five names in a list and display names in alphabatical order.
import java.util.*;
class p22
{
public static void main(String [] args)
{
String [] names=new String[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter five names");
for(i=0;i<names.length;i++)
{
names[i]=sc.nextLine();
}
Arrays.sort(names);//Arrays.sort() function sorts the array elements.
System.out.println("Names in alphabetical order");
for(String n:names)
{
System.out.println(n);
}
}
}