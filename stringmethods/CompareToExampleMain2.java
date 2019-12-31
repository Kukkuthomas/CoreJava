package stringmethods;

public class CompareToExampleMain2 
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));// returns 5 because s2 is empty 
		System.out.println(s2.compareTo(s3));// returns -2 because s2 is empty 
	}
}
