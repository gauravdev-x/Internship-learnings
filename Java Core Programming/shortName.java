//WAP in JAVA to print the short name of given full name

class shortName
{
public static void main(String  [] args)
{
java.util.Scanner sc=new java.util.Scanner(System.in);	//Inline importing

String fullname,shortname="";

System.out.print("Enter the Name: ");

fullname=sc.nextLine();

String [] arr=fullname.split(" ");

for(int i=0; i<arr.length-1;i++)
{
shortname=shortname+arr[i].charAt(0)+".";
}

shortname=shortname+arr[arr.length-1];

System.out.print("Short Name: "+shortname);
}
}
