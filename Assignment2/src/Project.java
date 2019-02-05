package com.ncu.assignment;
import java.util.*;
public class Project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	public String [] responsibilities;
	
	public void setname(String name)
	{
		this.name=name;
	}	
	public String getname()
	{
		return name;
	}
	
	public void setstartDate(Date startDate)
	{
		this.startDate=startDate;
	}
	public Date getstartDate()
	{
		return startDate;
	}
	
	public void setendDate(Date endDate)
	{
		this.endDate=endDate;
	}
	public Date getendDate()
	{
		return endDate;
	}
	
	public void setrole(String role)
	{
		this.role=name;
	}	
	public String getrole()
	{
		return role;
	}
	
	public void setresponsibilities(String [] responsibilities)
	{
		this.responsibilities=responsibilities;
	}
	public String [] getresponsibilities()
	{
		return responsibilities;
	}
}