package abstractandinheritance;
import java.util.Scanner;
public class AbstractClass 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		AbstractInterface o=new AbstractInterface();
		o.add(20,15);
		o.sub(30,10);
		o.mul(20,3);
		o.div(10,5);
	}
	
}
