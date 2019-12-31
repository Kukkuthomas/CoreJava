package stringmethods;

public class ContainsExampleMain2 
{
	public static void main(String[] args)
	{
		String str="Hello F#A#C#E@2.0 readers";
		boolean isContains=str.contains("F#A#C#E");//it returns true
		System.out.println(isContains);
		System.out.println(str.contains("FACe"));//Case sensitive, because it returns false
	}
}
