class Employee
{
int empid;//instance variable
String empname;//instance variable
long salary; //instance variable
void setValue(int eid,String ename,long sal)
{
empid=eid;
empname=ename;
salary=sal;
}
void display()
{
System.out.println("Employee Id="+empid);
System.out.println("Employee Name="+empname);
System.out.println("Employee Salary="+salary);
}
}
class ClassDemo2
{
public static void main(String [] args)
{
Employee e1=new Employee(); //Creation of object
e1.setValue(1001,"Raman",45000);
e1.display();
Employee e2=new Employee();
e2.setValue(1002,"Rajat",55000);
e2.display();
}
}

