package coreJPgm;
import java.util.Scanner;
public class CJ3 
{
		
	String name,address,contactNumber,email,proofType,proofId;

	public void setName(String name)
	{
		this.name=name;	
	}
	public void setAddress(String address)
	{
		this.address=address;	
	}
	public void setContact(String contactNumber)
	{
		this.contactNumber=contactNumber;	
	}
	public void setEmail(String email)
	{
		this.email=email;	
	}
	public void setPtype(String prooftype)
	{
		this.proofType=proofType;	
	}
	public void setPid(String proofId)
	{
		this.proofId=proofId;	
	}
	
	public String getName()
	{
		return this.name;	
	}
	public String getAddress()
	{
		return this.address;	
	}
	public String getContact()
	{
		return this.contactNumber;	
	}
	public String getEmail()
	{
		 return this.email;	
	}
	public String getPtype()
	{
		return this.proofType;	
	}
	public String getPid()
	{
		return this.proofId;	
	}
}
