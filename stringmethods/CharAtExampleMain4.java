package stringmethods;

public class CharAtExampleMain4 
{
	public static void main(String[] args)
	{
		String str="Welcome to FACE portal";
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='t')//check the specified character
			{
				count++;
			}
		}
		System.out.println("Frequency of t is : "+count);//Returns the value of count
	}
}
