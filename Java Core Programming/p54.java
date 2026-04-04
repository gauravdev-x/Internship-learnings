//WAP Generator getpassword
import java.util.Random;
class Generator
{
public int getRandomNumber(int min,int max)
{
Random r=new Random();
int n=r.nextInt((max+1)-min)+min;
return n;
}
public String getOTP()
{
String otp="";
for(int i=1;i<=6;i++)
otp=otp+getRandomNumber(0,9);
return otp;
}
public String getPassword()
{
String get="";
get=get+(char)getRandomNumber(97,122); //a-z
get=get+(char)getRandomNumber(97,122);
get=get+(char)getRandomNumber(48,57); //0-9
get=get+(char)getRandomNumber(48,57);
get=get+(char)getRandomNumber(65,90); //A-Z
get=get+(char)getRandomNumber(65,90);
return get;
}
}

class TestRandom
{
public static void main(String [] args)
{
//Generator g=new Generator();
//System.out.println("OPT + ="+g.getOTP());
Generator g=new Generator();

System.out.println("getpassword Code :"+g.getPassword());

}
}