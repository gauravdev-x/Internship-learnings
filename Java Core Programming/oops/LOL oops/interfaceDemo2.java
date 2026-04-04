//First Meeting
interface School
{
void registration();
void feeSubmission();
void batchAllotment();
}
//Second Meeting
abstract class test1 implements School
{
public void registration()
{
System.out.println("Bussiness Logic Of Registration. ");
}
}
//Third Meeting
abstract class test2 extends test1
{
public void feeSubmission()
{
System.out.println("Bussiness Logic of Fee Submission. ");
}
}
class test3 extends test2
{
public void batchAllotment()
{
System.out.println("Busssiness Logic of Batch Allotment. ");
}
}
class interfaceDemo2
{
public static void main(String args[])
{
test3 obj=new test3();
obj.registration();
obj.feeSubmission();
obj.batchAllotment();
}
}
