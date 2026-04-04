import java.util.*;
class TreeSetDemo
{
public static void main(String [] args)
{
TreeSet<String> students=new TreeSet<String>();
students.add("priya");
students.add("Gaurav");
students.add("Shivam");
students.add("Ajay");
System.out.println("Elements of collection");
for(String s:students)
{
System.out.println(s);
}
}
}