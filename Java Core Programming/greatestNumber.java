//WAP to find the greatest number in three numbers

import java.util.Scanner;

class greatestNumber
{
public static void main(String [] args)
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Three Numbers: ");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();

if(x>y && x>z)
{
System.out.print(x+" is Greatest Number");
}

else if(y>x && y>z)
{
System.out.print(y+" is Greatest Number ");
}

else
{
System.out.print(z+" is Greatest Number");
}

}
}