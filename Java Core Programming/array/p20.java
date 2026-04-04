//WAP to find sum and average of 10 number using array.
import java.util.*;
class p20
{
public static void main(String [] args)
{
int [] x=new int[10];
int i,sum=0;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter ten number to the list");
for(i=0;i<10;i++)
{
x[i]=sc.nextInt();
sum=sum+x[i];
}
avg=(float)sum/10;
System.out.println("Sum="+sum);
System.out.println("Average="+avg);
}
}
