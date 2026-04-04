//WAP to check the Marrige Eligibility

import java.io.*;

class MarrigeEligibility
{
 public static void main(String [] args)throws IOException
 {
  BufferedReader var=new BufferedReader(new InputStreamReader(System.in));
  String name,gender;
  int age;

  System.out.print("Enter the Name: ");  
  name=var.readLine();

  System.out.print("Enter the Gender: ");  
  gender=var.readLine().toLowerCase();

  System.out.print("Enter the Age: ");  
  age=Integer.parseInt(var.readLine());

  if(gender.equals("male")==true && age>=21)
   {
    System.out.println("Name: "+name);  
    System.out.println("Age: "+age);  
    System.out.println("Gender: "+gender);  
    System.out.println("Congrats!! You're Eligible for Marriage.");  
   }

  else if(gender.equals("male")==true && age<21)
   {
    System.out.println("Name: "+name);  
    System.out.println("Age: "+age);  
    System.out.println("Gender: "+gender);  
    System.out.println("Sorry!! You're not Eligible for Marriage.");  
   }
  else if(gender.equals("female")==true && age>=18)
   {
    System.out.println("Name: "+name);  
    System.out.println("Age: "+age);  
    System.out.println("Gender: "+gender);  
    System.out.println("Congrats!! You're Eligible for Marriage.");  
   }
  else if(gender.equals("female")==true && age<18)
   {
    System.out.println("Name: "+name);  
    System.out.println("Age: "+age);  
    System.out.println("Gender: "+gender);  
    System.out.println("Sorry!! You're not Eligible for Marriage.");  
   }
 }
}