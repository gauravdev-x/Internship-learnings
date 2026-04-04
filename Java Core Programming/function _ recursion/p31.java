//WAP in java to print the short name of given full name.

class p31
{
public static void main(String [] args)
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String fullname,shortname="";
System.out.print("Enter the fullname: ");

fullname=sc.nextLine();

String [] arr=fullname.split(" ");

for(int i=0;i<arr.length-1;i++)
{
shortname=shortname+ arr[i].charAt(0)+".";
}

shortname=shortname+arr[arr.length-1];
System.out.print("Short Name: "+shortname);
}
}