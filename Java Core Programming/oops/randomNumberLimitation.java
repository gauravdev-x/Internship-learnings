//WAP to find the random between limitaion
import java.util.Random;

class randomNumberLimitation
{
 public static void main(String[] args)
 {
  int min=5; 
  int max=10;
  Random rndm=new Random();
  int num=rndm.nextInt((max+1)-min)+min;
  //((10+1)-5)=6 that means 0-5 and then we add 0+min,1+min,2+min,3+min,4+min,5+min,6+min will be resultant random number
  
  System.out.println("Random Number= "+num);
 }
}