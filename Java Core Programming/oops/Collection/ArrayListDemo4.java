//WAP to create sn ArrayList of user-define object
import java.util.*;
class Employee
{
int empid;
String empname;
long salary;
Employee(int empid,String empname,long salary)//Constructor
{
this.empid=empid;
this.empname=empname;
this.salary=salary;
}
}

class ArrayListDemo4
{
public static void main(String [] args)
{
ArrayList<Employee> al=new ArrayList<Employee>();
Employee e1=new Employee(1001,"Rajat",80000);
al.add(e1);
al.add(new Employee(1001,"Rajat",80000));
al.add(new Employee(1002,"Priya",45000));
al.add(new Employee(1003,"Aman",40000));
al.add(new Employee(1004,"Mohit",60000));
System.out.println("List of Employee");
for(Employee e:al)
{
System.out.println(e.empid+"\t"+e.empname+"\t"+e.salary);
}
}
}