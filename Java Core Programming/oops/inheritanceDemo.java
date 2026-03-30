
class Base	//parent class/base class/super class
{
	public void getBase()
	{
	System.out.println("\nThis method of class Base");
	}
}

class Derived extends Base	//child class/derived class
{
	public void getDerived()
	{
	System.out.println("\nThis method of class Derived");	
	}
}

class inheritance
{
	public static void main(String [] args)
	{
	//Derived derived=new Derived();
	//derived.getBase();
	//derived.getDerived();	
	
	Base var=new Derived();
//var of class 'Base'= refrence of class 'Derived'
	var.getBase();
//var.getDerived(); //this is giving error, we can call the function/method jiska object bnaya hota hai	
	}
}
