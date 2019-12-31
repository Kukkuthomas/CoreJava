package console;

import java.io.Console;

public class ConsoleClassExample 
{
	public static void main(String args[])
	{
		String str;
		Console con=System.console();
		if(con==null)//checking if there is no console available
		{
			System.out.print("No console available");
			return;
		}
		str=con.readLine("Enter your name : ");//read the name
		System.out.print(str);
		System.out.println("Enter the password : ");//read password
		char[] ch=con.readPassword();
		String pass=String.valueOf(ch);//converting character array to string
		System.out.println("Password is : "+pass);
	}
}
