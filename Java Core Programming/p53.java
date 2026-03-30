//WAP RandomNumber
import java.util.Random;
class RandomNumber
{
public static void main(String [] args)
{
int min=10;
int max=20;
Random r=new Random();
int n = r.nextInt((max+1)-min)+min;
System.out.println(n);
}
}