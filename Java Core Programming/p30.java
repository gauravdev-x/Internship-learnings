																								
class p30
{
public static void main(String [] args)
{
int i,j=0;
int [] numbers=new int[25];
for(i=5;i<=100;i++)
{
if(i%5==0)
{
numbers[j]=i;
j++;
}
}
for(i=0;i<j;i++)
System.out.println(numbers[i]);
}
}
