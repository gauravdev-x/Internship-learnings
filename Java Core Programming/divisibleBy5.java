//WAP to store the numbers in an array which is divisible by 5 in 1-100 using loop

class divisibleBy5
{
public static void main(String [] args)
{
int [] AR=new int[25];
int i,n=0;
for (i=5; i<=100; i++)
{
	if(i%5==0)
	{
	AR[n]=i;	
	n++;		//here after updating n is = 5,6,7,8.....100
	}
}

for(i=0;i<n;i++)
/*here initialized on 0 coz in array indexing start on 0,
loop'll run until the 'i' is leass than 'n' → 100 */
{
System.out.println(AR[i]);
}

}
}