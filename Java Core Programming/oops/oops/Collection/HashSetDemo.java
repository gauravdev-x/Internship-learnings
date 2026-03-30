import java.util.*;

class HashSetDemo
{
public static void main(String [] args)
{
HashSet<String> hs=new HashSet<String>();
hs.add("c");
hs.add("c++");
hs.add("Java");
hs.add("c");
hs.add("Python");
System.out.println("Elements of hash set");
for(String e:hs)
{
System.out.println(e);
}
}
}