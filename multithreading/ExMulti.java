package multithreading;

public class ExMulti extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Music Player is Running");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Receive a whatsapp notification");
		}
	}
	public static void main(String args[])
	{
		ExMulti t=new ExMulti();
		t.start();//this will call run() function
		t.interrupt();
	}
}
