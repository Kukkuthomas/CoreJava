package coreJPgm;
import java.util.Scanner;
public class CustomerRegistration 
{		
	String name,address,contactNumber,email,proofType,proofId;

	public CustomerRegistration(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
		
	}
	void display()
	{
		System.out.println("\tRegistration Details");
		System.out.println("\t********************");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Contact No : "+contactNumber);
		System.out.println("Email Id : "+email);
		System.out.println("Proof Type : "+proofType);
		System.out.println("Proof Id : "+proofId);
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Customer Registration\n");
		System.out.println("=====================\n");
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your address");
		String address=s.nextLine();
		System.out.println("Contact Number");
		String contactNumber=s.nextLine();
		System.out.println("E-Mail ID");
		String email=s.nextLine();
		System.out.println("Enter proof type");
		String proofType=s.nextLine();
		System.out.println("Enter proof id");
		String proofId=s.nextLine();
		
		CustomerRegistration obj=new CustomerRegistration(name,address,contactNumber,email,proofType,proofId);
		obj.display();
		s.close();
	}
}
