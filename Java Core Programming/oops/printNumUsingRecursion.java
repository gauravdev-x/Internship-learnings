//WAP to print the 1-10 number by using recursion

class printNumUsingRecursion
{
public static void main(String [] args)
{

printNumUsingRecursion obj=new printNumUsingRecursion();
obj.printNumber(1);

}

public void printNumber(int n)
{

//System.out.print(n);

if(n<=10)
{

System.out.println(n);
n++;
printNumber(n);

}

}

}