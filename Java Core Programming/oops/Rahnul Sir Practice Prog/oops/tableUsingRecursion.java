//WAP to print the table by using recursion

import java.util.*;
class tableUsingRecursion
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter the Number to Print the Table: ");
int n=sc.nextInt();

tableUsingRecursion obj=new tableUsingRecursion();
obj.printTable(1,n);

}

public void printTable(int i,int n)
{

if(i<=10)
{
System.out.println(n+"*"+i+"="+(n*i));
i++;
printTable(i,n);
}
}

}