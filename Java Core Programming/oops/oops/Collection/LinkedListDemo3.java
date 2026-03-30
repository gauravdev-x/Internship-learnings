import java.util.*;
class LinkedListDemo3
{
public static void main(String [] args)
{
LinkedList<String> names=new LinkedList<String>();
LinkedList<String> depts=new LinkedList<String>();
names.add("Ravi");
names.add("Rajat");
names.add("Priya");
depts.add("Development");
depts.add("Management");
depts.add("HR");
names.addAll(depts);
System.out.println("Elements after merging");
for(String n:names)
{
System.out.println(n);
}
}
}