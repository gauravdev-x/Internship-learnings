class employee
{
int empid;
String empname;
long salary;
void setValue(int eid,String ename,long sal)
{
	empid=eid;
	empname=ename;
	salary=sal;
}
void display()
{
	System.out.println("Employee Id = "+empid);
	System.out.println("Employee Name = "+empname);
	System.out.println("Employee Salary = "+salary);
}
}
class demo2
{
	public static void main(String args[])
	{
	employee obj =new employee();
    obj.setValue(1001,"Ragav",45000);	
	obj.display();
	}
	
}