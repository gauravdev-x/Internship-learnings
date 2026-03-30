import java.util.Scanner;
class p10
{
public static void main(String [] args)
{
double bs,gs,hra,da;
Scanner sc=new Scanner(System.in);
System.out.print("Enter basic salary:");
bs=sc.nextDouble();
if(bs<=4000)
{
hra=bs*10/100;
da=bs*50/100;
}
else if(bs>4000 && bs<=8000)
{
hra=bs*20/100;
da=bs*60/100;
}
else if(bs>8000 && bs<=12000)
{
hra=bs*25/100;
da=bs*70/100;
}
else
{
hra=bs*30/100;
da=bs*80/100;
}
gs=bs+hra+da;
System.out.println("Gross Salary="+gs);
}
}