package javadatetime;
import java.time.Clock;
import java.time.Duration;
public class JavaClockExample 
{
	public static void main(String args[])
	{
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());//get the time-zone being used to create dates and times.
		Clock c2=Clock.systemUTC();
		System.out.println(c2.instant());//get the standard time
		Duration d=Duration.ofHours(5);
		Clock clock=Clock.offset(c2, d);
		System.out.println(clock.instant());
	}
}
