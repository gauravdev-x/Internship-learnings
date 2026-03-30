//WAP to demonstrate concept of non-static function
import java.util.*;
class p33
{
public static void main(String [] args)
{
int l,b,h,v;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,breadth and height of cuboid");
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
p33 p=new p33();
v=p.volume(l,b,h);
System.out.println("Volume of cuboid="+v);
}
int volume(int x,int y,int z)//Non-static function
{
return(x*y*z);
}
}