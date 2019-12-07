package coreJPgm;
abstract class Anony
{
	abstract void name();
}
public class CAnono 
{
	public static void main(String[] args)
	{
		Anony ano=new Anony()
		{
			public void name()
			{
				System.out.println("Hi Athira..");
			}
		};
		ano.name();
	}	
}
