package multithreading;

public class ThreadExample extends Thread
{
	public void run()
	{
		System.out.println("Running thread main is : "+Thread.currentThread().getName());
		System.out.println("Running thread priority is : "+Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		ThreadLocal <Number> obj1=new ThreadLocal <Number>();
		ThreadLocal <String> obj=new ThreadLocal <String>();
		obj1.set(100);
		System.out.println("Value = "+obj1.get());
		obj1.set(90);
		System.out.println("Value = "+obj1.get());
		obj.set("JAVA");
		System.out.println("Value = "+obj.get());
		obj.remove();
		System.out.println("Value = "+obj.get());
		obj1.remove();
		System.out.println("Value = "+obj1.get());
		ThreadExample m1=new ThreadExample();
		ThreadExample m2=new ThreadExample();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}
