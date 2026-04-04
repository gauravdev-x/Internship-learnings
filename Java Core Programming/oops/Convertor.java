/*
WAP to convert a decimal number to its binary, octal and hexa-decimal equivalent.
*/
import java.util.*;
class convertor
{
public static void main(String [] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number :");
n=sc.nextInt();
System.out.println("Binary format="+Integer.toString(n,2));
System.out.println("Octal format="+Integer.toString(n,8));
System.out.println("Hexa-decimal format="+Integer.toString(n,16));
}
}