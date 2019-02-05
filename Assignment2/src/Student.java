package com.ncu.assignment;
import java.util.*;
public class Student
{
	String firstName;
	String  lastName;
	public Address  addr;
	Date dob;
	public String [] skills;
	public Qualification [] qual;
	public Project [] projects;
	String eMail;
	String contactNo;
	
	public Student()
	{
		addr=new Address();
	}
	public Student(int qsize,int psize)
	{
		qual=new Qualification[qsize];
		projects=new Project[psize];	
	}
		
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getfirstName()
	{
		return firstName;
	}
	
	public void setlastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getlastName()
	{
		return lastName;
	}
	
	public void setdob(Date dob)
	{
		this.dob=dob;
	}
	public Date getdob()
	{
		return dob;
	}
	
	public void seteMail(String eMail)
	{
		this.eMail=eMail;
	}
	public String geteMail()
	{
		return eMail;
	}
	
	public void setskills(String [] skills)
	{
		this.skills=skills;
	}
	public String[] getskills()
	{
		return skills;
	}
	
	public void setcontactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	public String getcontactNo()
	{
		return contactNo;
	}	
}