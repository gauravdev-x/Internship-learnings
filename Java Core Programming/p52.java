import java.util.Random;
 
class RandomValue
{
public static void main(String [] args)
{
Random r=new Random();
int n=r.nextInt(5)+1;
System.out.println(n);
}
}

