package coreJPgm;
class CJOverriding_Parent
{
	public void addition(int a, int b)
	{
		int x=a+b;
		System.out.println(x);
	}
}
class CJOverr_Child1 extends CJOverriding_Parent
{
	public void addition(int a, int b)
	{
		int x=a+b;
		System.out.println(x);
	}
}
	
class CJOverriding 
{
	public static void main(String args[])
	{		
		CJOverriding_Parent over=new CJOverriding_Parent();
		CJOverriding_Parent overc=new CJOverr_Child1();
		//over.addition(10, 20);
		overc.addition(20,30);
	}
}
