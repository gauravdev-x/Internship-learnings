class Employee
{
int empid;
String empname;
void setEmployee(int eid,String ename)
{
empid=eid;
empname=ename;
}
void getEmployee()
{
System.out.println("Employee Id="+empid);
System.out.println("Employee Name="+empname);
}
}
class Payroll extends Employee
{
int bs,hra,da;
void setPayroll(int b,int h,int d)
{
bs=b;
hra=h;
da=d;
}
void getPayroll()
{
System.out.println("Basic Salary="+bs);
System.out.println("House Rent Allownces="+hra);
System.out.println("Dearness Allownces="+da);
}
}
class Payslip extends Payroll
{
void netSalary()
{
System.out.println("Net Salary="+(bs+hra+da));
}
}
class InDemo3
{
public static void main(String [] agrs)
{
Payslip ps=new Payslip();
ps.setEmployee(1001,"Ravi");
ps.setPayroll(35000,2000,15000);
System.out.println("************PAY SLIP*********");
ps.getEmployee();
ps.getPayroll();
ps.netSalary();
}
}













