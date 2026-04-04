import java.util.*;
class LinkedListDemo5
{
public static void main(String [] args)
{
LinkedList<Integer> al=new LinkedList<Integer>();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
ListIterator itr=al.listIterator();
System.out.println("Traver in forward direction");
while(itr.hasNext());
{
System.out.println(itr.next());
}
System.out.println("Traver in backward direction");
while(itr.hasPrevious());
{
System.out.println(itr.previous());
}
}
}