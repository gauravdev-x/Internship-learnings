import java.util.*;
class LinkedListDemo2
{
public static void main(String [] args)
{
LinkedList<String> al=new LinkedList<String>();
al.add("Hindi");
al.add("English");
al.add("Urdu");
al.addFirst("Bhojpuri");
al.addLast("Bengali");
al.add("Marathi");
for(String lan:al)
{
System.out.println(lan);
}
}
}