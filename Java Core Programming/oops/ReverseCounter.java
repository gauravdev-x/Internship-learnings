//WAP Reverse Counter
 class ReverseCounter
{
public static void main(String [] args)
{
int i;
for(i=10;i>0;i--)
{
System.out.println(i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ex)
{

}
}
}
}