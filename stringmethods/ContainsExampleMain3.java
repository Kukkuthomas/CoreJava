package stringmethods;

public class ContainsExampleMain3 
{
	public static void main(String[] args)
	{
		String str="To learn java visit focusaccademy.in";//string initialization
		if(str.contains("focusAccademy.in.com"))
		{
			System.out.println("This string contains focusaccademy.in");//condition is true return specified string
		}
		else
			System.out.println("Result not found");//condition false return result not found
	}
}
