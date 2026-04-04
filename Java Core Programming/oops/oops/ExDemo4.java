//Simple Calculator.
import java.io.*;
class ExDemo4
{
public static void main(String [] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b;
System.out.println("Enter two number");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
System.out.println("Summation="+(a+b));
System.out.println("Subtration="+(a-b));
System.out.println("Multiplication="+(a*b));
System.out.println("Division="+(a/b));
}
}
