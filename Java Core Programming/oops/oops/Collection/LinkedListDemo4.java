import java.util.*;
class Student
{
int rollno;
String name;
int fee;
Student(int rollno,String name,int fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
}
class LinkedListDemo4
{
public static void main(String [] args)
{
LinkedList<Student> al=new LinkedList<Student>();
al.add(new Student(1001,"rajat",250000));
al.add(new Student(1002,"Priya",200000));
al.add(new Student(1003,"Shikha",220000));
System.out.println("List of students");
Iterator itr=al.iterator();
while(itr.hasNext())
{
Student stu=(Student)itr.next();
System.out.println(stu.rollno+"\t"+stu.name+"\t"+stu.fee);
}
}
}




