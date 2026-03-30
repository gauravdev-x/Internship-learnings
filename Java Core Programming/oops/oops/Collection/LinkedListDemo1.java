import java.util.*;
class LinkListDemo1
{
public static void main(String [] args)
{
LinkedList<String> al=new LinkedList<String>();
al.add("C");
al.add("C++");
al.add("java");
al.add("python");
Iterator itr=al.iterator();
System.out.println("Element of Linked List: ");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}