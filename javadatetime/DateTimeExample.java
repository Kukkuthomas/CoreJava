package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample 
{
	public static void main(String args[])
	{
		//Current date
		LocalDate localDate=LocalDate.now();
		System.out.println("Today's Date is : "+localDate);
		
		//Specific Date
		LocalDate localDate2=LocalDate.of(2020, Month.JANUARY, 02);
		System.out.println(localDate2);
		LocalDate localDate3=LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(localDate3);
		
		System.out.println("Year : "+localDate.getYear());
		System.out.println("Month : "+localDate.getMonth().getValue());
		System.out.println("Day of Month : "+localDate.getDayOfMonth());
		System.out.println("Day of week : "+localDate.getDayOfWeek());
		System.out.println("DayOfYear : "+localDate.getDayOfYear());
		
		//LocalDate's plus methods
		System.out.println("Additon of days : "+localDate.plusDays(5));
		System.out.println("Additon of Months : "+localDate.plusMonths(15));
		System.out.println("Additon of weeks : "+localDate.plusWeeks(45));
		System.out.println("Additon of Years : "+localDate.plusYears(5));
		
		//LocalDate's minus methods
		System.out.println("Subtraction of days : "+localDate.minusDays(5));
		System.out.println("Subtraction of Months : "+localDate.minusMonths(15));
		System.out.println("Subtraction of weeks : "+localDate.minusWeeks(45));
		System.out.println("Subtraction of Years : "+localDate.minusYears(5));
		
		//isEquals() example
		if(localDate.isEqual(localDate2))
		{
			System.out.println("LocalDate1 & LocalDate2 are equal");
		}
		else
		{
			System.out.println("LocalDate1 & LocalDate2 are not equal");
		}
		
		//ifAfter() example
		if(localDate2.isAfter(localDate3))
		{
			System.out.println("LocalDate2 comes after LocalDate3");
		}
		
		//ifBefore() example
		if(localDate2.isAfter(localDate3))
		{
			System.out.println("LocalDate3 comes before LocalDate1");
		}		
	}
}
