package coreJPgm;
import java.util.Scanner;
public class CJInher_Child extends CJInher_Parent
{
	public void add()
	{
		int a=10,b=20,c=0;
		c=a+b+10;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		//CJInher_Parent obj=new CJInher_Parent();
		CJInher_Parent obj=new CJInher_Child();
		obj.add();
		
	}
}
