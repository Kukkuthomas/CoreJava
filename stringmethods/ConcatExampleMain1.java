package stringmethods;

public class ConcatExampleMain1 
{
	public static void main(String[] args)
	{
		String s1="java string"; //initialize string str
		s1.concat("is immutable");
		System.out.println(s1);
		s1=s1.concat(" is immutable so assign it explicitly");//concatnat string s1 
		System.out.println(s1);
	}
}
