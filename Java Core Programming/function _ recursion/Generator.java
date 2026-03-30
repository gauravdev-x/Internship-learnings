import java.util.Random;
class RandomNumberGenerator
{
public int getRandomNumber(int min,int max)
{
Random r=new Random();
int n=r.nextInt((max+1)-min)+min;
return n;
}
/*
public String getOTP()
{
String otp="";
for(int i=1;i<=6;i++)
otp=otp+getRandomNumber(0,9);
return otp;
}
*/
public String captchaCode()
{
String cap="";
cap=cap+(char)getRandomNumber(97,122); //a-z
cap=cap+(char)getRandomNumber(97,122);
cap=cap+(char)getRandomNumber(48,57); //0-9
cap=cap+(char)getRandomNumber(48,57);
cap=cap+(char)getRandomNumber(65,90); //A-Z
cap=cap+(char)getRandomNumber(65,90);
return cap;
}
}

class TestRandom
{
public static void main(String [] args)
{
//Generator g=new Generator();
//System.out.println("OPT + ="+g.getOTP());
Generator c=new Generator();

System.out.println("Captcha Code :"+c.captchaCode());

}
}