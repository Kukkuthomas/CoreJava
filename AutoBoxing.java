package wrapper;

public class AutoBoxing 
{
	public static void main(String[] args)
	{
		Integer i=20;//Converting int into Integer
		Integer j=i;//autoboxing now compiler will write integer.valueOf(a) internally
		System.out.println(i+" "+j);
	}
}
