package coreJPgm;
public class InnerOuterClass 
{
	private int a=10;
	class Inner
	{
		public void fun()
		{
			System.out.println("Value of a is : "+a);
		}
	}
	public static void main(String args[])
	{
		InnerOuterClass out=new InnerOuterClass();
		InnerOuterClass.Inner inn=out.new Inner();		
		inn.fun();
	}
}
