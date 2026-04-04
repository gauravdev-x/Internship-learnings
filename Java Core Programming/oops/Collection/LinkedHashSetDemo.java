import java.util.*;
class LinkedHashSetDemo
{
public static void main(String [] args)
{
LinkedHashSet<String> hs=new LinkedHashSet<String>();
hs.add("C");
hs.add("C++");
hs.add("Java");
hs.add("C");
hs.add("Pythan");
System.out.println("Elements of linked set");
for(String e:hs)
{
System.out.println(e);
}
}
}