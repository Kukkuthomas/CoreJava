package coreJPgm;
import java.util.Scanner;
public class OverloadExample 
{
	Scanner s=new Scanner(System.in);
	public void area(float d,float e)
	{
		float a=(float)(0.5*d*e);
		System.out.println("Area of a Triangle : "+a);
	}
	public void area(int l, int b)
	{
		int a=l*b;
		System.out.println("Area of a Rectangle : "+a);
	}
	public void area(float d)
	{
		float a=(float)(3.14*d*d);
		System.out.println("Area of a Circle : "+a);
	}
	public void area(int side)
	{
		int a=side*side;
		System.out.println("Area of a Square : "+a);
	}
	public static void main(String args[])
	{
		OverloadExample obj=new OverloadExample();
		System.out.println("\tAREA");
		System.out.println("\t****");
		obj.area(5.0f,7.0f);
		obj.area(8,4);
		obj.area(3.0f);
		obj.area(4);
	}
}
