class Employee
{
private int empid;
private String empname;
private double salary;

public Employee(int empid,String empname,double salary)
 {
  this.empid=empid;
  this.empname=empname;
  this.salary=salary;
 }

public Employee(Employee e)
 {
  System.out.println("\nCopy Constructor Called");
  this.empid=e.empid;
  this.empname=e.empname;
  this.salary=e.salary;
 }


public void getEmployeeDetails()
 {
  System.out.println("----Employee Details-----");
  System.out.println("Employee Id :"+empid);
  System.out.println("Employee Name :"+empname);
  System.out.println("Employee Salary :"+salary);
 }
}

class TestEmployee
{
public static void main(String [] args)
{
Employee emp=new Employee(1001,"Aman Pratap Singh",34000);
emp.getEmployeeDetails();
Employee emp2=new Employee(emp);
emp2.getEmployeeDetails();
}
}