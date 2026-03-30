//Banking Solution
import java.io.*;
class Banking
{
int acno;    //instance variables
String name; //instance variables
long balance;
Banking(int ano,String na,long bal) //Construction
{
acno=ano;
name=na;
balance=bal;
}
void deposit(int ano,long amt)
{
if(acno==ano)
{
balance=balance+amt;
System.out.println("The amount "+amt+"is credited in your account");
}
else
{
System.out.println("The account no doesn't exist");
}
}
void widthdraw(int ano,long amt)
{
if(acno==ano)
{
if(balance>=amt)
{
balance=balance-amt;
System.out.println("The amount"+amt+"is debited from your account");
}
else
{
System.out.println("Unsufficient balance");
}
}
else
{
System.out.println("The account no doesn't exist");
}
}
void balanceEnquiry(int ano)
{
if(acno==ano)
{
System.out.println("Your balance amount="+balance);
}
else
{
System.out.println("The account no doesn't exist");
}
}
}

class Bank
{
public static void main(String [] args) throws IOException
{
int ano;
String na;
long bal;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter account no: ");
ano=Integer.parseInt(br.readLine());
System.out.println("Enter name: ");
na=br.readLine();
System.out.print("Enter balance: ");
bal=Long.parseLong(br.readLine());

Banking b=new Banking(ano,na,bal); //Creation of object and calling of constructor
System.out.println("Account is created");
long amt;
int ch=0;

while(ch!=4)
{
System.out.println("1->Deposit");
System.out.println("2->withdraw");
System.out.println("3->Balance Enquiry");
System.out.println("4->Exit");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Enter account no :");
ano=Integer.parseInt(br.readLine());
System.out.println("Enter amount to deposit :");
amt=Long.parseLong(br.readLine());
b.deposit(ano,amt);
break;

case 2:
System.out.println("Enter account no :");
ano=Integer.parseInt(br.readLine());
System.out.println("Enter amount to withdraw :");
amt=Long.parseLong(br.readLine());
b.widthdraw(ano,amt);
break;

case 3:
System.out.println("Enter account no :");
ano=Integer.parseInt(br.readLine());
b.balanceEnquiry(ano);
break;

case 4:
break;

default:
System.out.println("Invalid choice");
break;
}
}
}
}
