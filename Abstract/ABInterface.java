package Abstract;
class ABInterface implements ABInterfirs, ABIntersec
{
		
		public void add(int a,int b)
		{
			System.out.println("\nSum of "+a+" and "+b+" is : "+(a+b));
			
		}
		public void sub(int a,int b)
		{
			System.out.println("Difference of "+a+" and "+b+" is : "+(a-b));
		}
		public void mul(int a,int b)
		{
			System.out.println("Product of "+a+" and "+b+" is : "+(a*b));
		}
		public void div(int a,int b)
		{
			System.out.println("Division of "+a+" and "+b+" is : "+(a/b));
		}
}
