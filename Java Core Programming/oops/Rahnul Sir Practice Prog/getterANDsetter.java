class getANDset
{
 private int a;		//class variable/class data members/
 private int b;

 public void sum()
 {
  System.out.println("\nSummation= "+(a+b));
 }

	 //setter
 public void setA(int a)
 {
  this.a=a;
 }
 public void setB(int b)
 {
  this.b=b;
 }

	//getter
 public int getA()
 {
  return a;
 }
 public int getB()
 {
  return b;
 }

}

class getterANDsetter
{
 public static void main(String[] args)
 {
 getANDset obj=new getANDset();
 obj.setA(100);
 obj.setB(200);

 obj.sum();

 System.out.println("\nA= "+obj.getA());
 System.out.println("\nB= "+obj.getB());

 }
}