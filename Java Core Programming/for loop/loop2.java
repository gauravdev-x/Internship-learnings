/* Program to find number divisible by 3 from 1-100*/
import java.lang.Thread;
class loop2
{
public static void main(String args[])
{
int i;
System.out.println("The Number divisible by 3 are :- ");
for(i=1;i<=100;i++)
{
if(i%3==0)
{
System.out.print(i+"  ");
try{
Thread.sleep(500);
}
catch(Exception ex){}
}
}
}
}