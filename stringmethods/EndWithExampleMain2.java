package stringmethods;

public class EndWithExampleMain2 
{
	public static void main(String[] args)
	{
		String str="Welcome to FACE.in";
		System.out.println(str.endsWith("in"));//return true
		if(str.endsWith(".com"))
		{
			System.out.println("String ends with .com");//statement is true returns the statement
		}
		else
			System.out.println("It does not ends with .com");//statement is false returns the statement
	}
}
