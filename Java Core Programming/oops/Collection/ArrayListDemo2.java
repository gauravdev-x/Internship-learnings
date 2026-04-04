import java.util.*;
class ArrayListDemo2
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<Integer>();
int n,i,element;
System.out.println("How many elements you want to store in list?");
n=sc.nextInt();
System.out.println("Enter "+n+" elements);
for(i=0;i<n;i++)
{
System.out.println("Enter "+(i+1)+"elements :");
element=sc.nextInt()
al.add(i,element);
}
System.out.println("You have entered number in list :");
for(Integer x:al)
{
System.out.println(x);
}
System.out.println("The original list elements");
for(Integer x:al)
{
System.out.println(x);
}
Collections.sort(al);
System.out.println("This elements in sorted order");
for(Integer x:al)
{

}







}