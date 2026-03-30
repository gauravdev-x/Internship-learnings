//WAP to search a number in a list using linear search.
import java.util.*;
class p21
{
public static void main(String [] args)
{
int [] list=new int[10];
int i,n,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter ten number to the list");
for(i=0;i<10;i++)
{
list[i]=sc.nextInt();
}
System.out.print("Enter a number to search in list:");
n=sc.nextInt();
for(i=0;i<10;i++)//searching 
{
if(n==list[i])
{
f=1;
break;
}
}
if(f==1)
System.out.println("Number"+n+" is found  at location "+(i+1));
else
System.out.println("Number is not found");
}
}