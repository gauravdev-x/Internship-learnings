//Marriage Test
import java.io.*;
class MarriageTest
{
public static void main(String args[]) throws IOException
{
	String name,gender;
	int age;
	BufferedReader shukla =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Apna Naamwa Batao");
	name=shukla.readLine();
	System.out.println("Apni Umarwa Batao");
	age=Integer.parseInt(shukla.readLine());
	System.out.println("Enter your Gender");
	gender=shukla.readLine();
	if(age>=21&&gender.toLowerCase().equals("male"))
	{
		System.out.println("Badai ho !!!!!!!!"+name+" tumri zaldi he hone wali hai");
	}
	else if(age>=18&&gender.toLowerCase().equals("female"))
	{
		System.out.println("Badai ho !!!!!!!!"+name+" tumri zaldi he hone wali hai");
	}
	else
	{
		System.out.println("tum abi bacche ho ho...padai pay dyan do	");
	}
}
}