//WAP to generate random password

import java.util.*;
class PwdGenerator
{
 public int getRandomNum(int min,int max)
 {
  Random rndm=new Random();
  int num=rndm.nextInt((max+1)-min)+min;
  return num;
 }

 public String pwdCode()
 {
  String pwd="";
  pwd=pwd+(char)getRandomNum(65,90);	//A-Z
  pwd=pwd+(char)getRandomNum(65,90);	//A-Z

  pwd=pwd+(char)getRandomNum(48,57);	//0-9 → it's coz of typecast with 
  pwd=pwd+(char)getRandomNum(48,57);	//0-9
  pwd=pwd+(char)getRandomNum(48,57);	//0-9

  pwd=pwd+(char)getRandomNum(97,122);	//a-z
  pwd=pwd+(char)getRandomNum(97,122);	//a-z

  pwd=pwd+(char)getRandomNum(35,38);	//ASCAII of Special Character

  return pwd;

 }
}
class RandomPwdGenerator
{
 public static void main(String[] args)
 {
  PwdGenerator p=new PwdGenerator();
 
  System.out.println("Random Password: "+p.pwdCode());

 }
}