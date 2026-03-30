//WAP to demonstrate concept of static function
import java.util.*;
class p32
{
//Here you can create function
static int add(int x,int y)
{
return (x+y);
}
static public void main(String [] args)
{
int a,b,s;
Scanner sc=new Scanner(System.in);
System .out.println("Enter two number :");
a=sc.nextInt();
b=sc.nextInt();
s=add(a,b);
System.out.println("Sum="+s);
}
//Here you can create function 

}