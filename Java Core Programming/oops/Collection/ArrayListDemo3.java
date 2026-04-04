
import java.util.*;
class ArrayListDemo3
{
 public static void main(String[] args)
 { 
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> al=new ArrayList<Integer>();
 
  System.out.print("\nEnter the Number of Elements You want to Store in List: "); 
  int num=sc.nextInt();

  for(int i=0;i<num;i++)
  {
   System.out.print("Enter "+(i+1)+" Number: ");
   int element=sc.nextInt();
   al.add(i,element);
  }

  System.out.print("\nYour Input Number of List: ");  
  for(Integer n:al)
   System.out.print("\t"+n);

  Collections.sort(al);
  System.out.print("\nYour   List   is  Sorted: ");  
  for(Integer n:al)
   System.out.print("\t"+n);

  Collections.reverse(al);
  System.out.print("\nList in Discending Order: ");  
  for(Integer n:al)
   System.out.print("\t"+n);

 }
}