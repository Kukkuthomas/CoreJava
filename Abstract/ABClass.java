package Abstract;
import java.util.Scanner;
public class ABClass 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		ABInterface o=new ABInterface();
		o.add(20,15);
		o.sub(30,10);
		o.mul(20,3);
		o.div(10,5);
	}
	
}
