package ObjClass;

public class Objectclass 
{
	static int last_roll=100;
	int roll_no;
	//constructor
	Objectclass()
	{
		roll_no=last_roll;
		last_roll++;
	}
	
	//overriding hashcode()
	@Override
	public int hashCode()
	{
		return roll_no;
	}
	
	//Driver code
	public static void main(String args[])
	{
		Objectclass s=new Objectclass();
		//Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("FAKE");
		Class c=obj.getClass();
		System.out.println("Class of object obj is : "+c.getName());
		s=null;
		System.gc();//garbage collection
	}
	@Override
	protected void finalize()
	{
		System.out.println("Finalize method called");
	}
}
