import java.util.Date;
import java.text.SimpleDateFormat;
class p42
{
public static void main(String [] args)
{
Date d=new Date();
//System.out.println(d);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
String str=sdf.format(d);
System.out.println(str);
}
}