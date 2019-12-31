package stringmethods;

import java.util.ArrayList;

public class EqualsExampleMain2 
{
	public static void main(String[] args)
	{
		String str="FACENEXT";
		ArrayList<String> list=new ArrayList<>();
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENEXT");
		list.add("FACENOW");
		for(String str1 : list)
		{
			if(str1.equals(str))
			{
				System.out.println("FACENEXT is present");//statement is true returns the statements
			}
		}
	}
}
