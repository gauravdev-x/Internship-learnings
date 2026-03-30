class employee
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
System.out.println("Employee Id = "+empid);
System.out.println("Employee Name = "+empname);
}
}
class payroll extends employee
{
int bs,hra,da;
void setPayroll(int b, int h,int d)
{
bs=b;
hra=h;
da=d;
}
void getpayroll()
{
System.out.println("Basic Salary = "+bs);
System.out.println("House Rent Allownces = "+hra);
System.out.println("Dearness Allownces = "+da);
}
}
class payslip extends payroll
{
void netsalary()
{
System.out.println("Net Salary = "+(bs+hra+da));
}
}
class indemo3
{
public static void main(String args[])
{
payslip obj=new payslip();
obj.setEmployee(101,"Rohan");
obj.setPayroll(20000,2000,1500);
System.out.println("------------Here is Your Pay Slip-----------");
obj.getEmployee();
obj.getpayroll();
obj.netsalary();
}
}