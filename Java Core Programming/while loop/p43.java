//WAP to check a number of palindrome.
import java.util.*;
class pro
{
public static void getPrindrome(int n)
{
int temp=n;
int rev=0;
while(n>0)
{
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(temp==rev)
System.out.println("Entered is palindrome :"+temp);
else
System.out.println("Entered no. is not palindrome");
}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int num;
System.out.print("Enter a number :");
num=sc.nextInt();
getPrindrome(num);
}
}