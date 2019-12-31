package stringmethods;

public class CompareToExampleMain1 
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s2));// it returns 0 because both are equal
		System.out.println(s1.compareTo(s3));// it returns -5 because h is 5 times lower than m
		System.out.println(s1.compareTo(s4));// it returns -1 because l is 1 times lower than m
		System.out.println(s1.compareTo(s5));// it returns 2 because h is 2 times greater than f
	}
}
