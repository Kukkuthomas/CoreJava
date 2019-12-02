package coreJPgm;
import coreJPgm.CJ3;
import java.util.Scanner;
public class CJMain3 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		CJ3 obj=new CJ3();
		//String name,address,contactNumber,email,proofType,proofId;
		
		System.out.println("Customer Registration");
		System.out.println("=====================");
		System.out.println("Enter your name");
		obj.name=s.nextLine();
		System.out.println("Enter your address");
		obj.address=s.nextLine();
		System.out.println("Contact Number");
		obj.contactNumber=s.nextLine();
		System.out.println("E-Mail ID");
	    obj.email=s.nextLine();
		System.out.println("Enter proof type");
		obj.proofType=s.nextLine();
		System.out.println("Enter proof id");
		obj.proofId=s.nextLine();
		
		
		System.out.println("\tRegistration Details");
		System.out.println("\t********************");
		System.out.println("Name : "+obj.name);
		System.out.println("Address : "+obj.address);
		System.out.println("Contact No : "+obj.contactNumber);
		System.out.println("Email Id : "+obj.email);
		System.out.println("Proof Type : "+obj.proofType);
		System.out.println("Proof Id : "+obj.proofId);
		s.close();
	}

}
