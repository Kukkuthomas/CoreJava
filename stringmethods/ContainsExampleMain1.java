package stringmethods;

public class ContainsExampleMain1 
{
	public static void main(String[] args)
	{
		String name="what do you know about me";//String initialization
		System.out.println(name.contains("do you know"));//return true
		System.out.println(name.contains("about"));//return true
		System.out.println(name.contains("hello"));//return false
	}
}
