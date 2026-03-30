//WAP to create a captcha code

import java.util.*;
class CaptchaGenerator
{
 public int getRandomNum(int min,int max)
 {
  Random rndm=new Random();
  int num=rndm.nextInt((max+1)-min)+min;
  return num;
 }

 public String captchaCode()
 {
  String captcha="";
  captcha=captcha+(char)getRandomNum(97,122);	//a-z
  captcha=captcha+(char)getRandomNum(97,122);	//a-z
  captcha=captcha+(char)getRandomNum(48,57);	//0-9 → it's coz of typecast with 
  captcha=captcha+(char)getRandomNum(48,57);	//0-9
  captcha=captcha+(char)getRandomNum(65,90);	//A-Z
  captcha=captcha+(char)getRandomNum(65,90);	//A-Z

  return captcha;

 }
}


class CaptchaCodeGenerator
{
 public static void main(String[] args)
 {
  CaptchaGenerator cap=new CaptchaGenerator();
 
  System.out.println("Captcha Code: "+cap.captchaCode());

 }
}