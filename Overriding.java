package coreJPgm;
class Overriding_Parent
{
	public void addition(int a, int b)
	{
		int x=a+b;
		System.out.println(x);
	}
}
class Overriding_Child1 extends Overriding_Parent
{
	public void addition(int a, int b)
	{
		int x=a+b;
		System.out.println(x);
	}
}
	
class Overriding 
{
	public static void main(String args[])
	{		
		Overriding_Parent over=new Overriding_Parent();
		Overriding_Parent overc=new Overriding_Child1();
		//over.addition(10, 20);
		overc.addition(20,30);
	}
}
