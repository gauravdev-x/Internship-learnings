//OTP Generator using Random Class

import java.util.Random;
class OTPGenerator
{
 public int getRandomNumber(int min,int max)
 {
  Random rndm=new Random();
  int num=rndm.nextInt((max+1)-min)+min;
  return num;
 }
 
 public String getOTP()
 {
  String otp="";
  for(int i=1;i<=6;i++)
  
  otp=otp+getRandomNumber(0,9);
//that means limit is 0 to 9 and this passing to getRandomNumber(int max,int min) 
  return otp;
    
 }	
}

class OTPCodeGenerator
{
 public static void main(String[] args)
 {
  OTPGenerator obj=new OTPGenerator();

  System.out.println("OTP = "+obj.getOTP()); 
 }
}