package stringmethods;

public class EqualsExampleMain1 
{
	public static void main(String[] args)
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="facenext";
		System.out.println(s1.contentEquals(s2));//returns true because contents are equal
		System.out.println(s1.contentEquals(s3));//returns false because contents are not equal
		System.out.println(s1.contentEquals(s4));//returns false because contents are not equal
	}
}
