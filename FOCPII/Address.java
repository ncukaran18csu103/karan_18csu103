package com.ncu.assignment;
public class Address
{
	String lineI;
	String lineII;
	String city;
	String state;
	int pinCode;
	
	public void setline1(String lineI)
	{
		this.lineI=lineI;
	}
	public String getlineI()
	{
		return lineI;
	 }
	
	public void setlineII(String lineII)
	{
		this.lineII=lineII;
	}
	public String getlineII()
	{
		return lineII;
	}
	
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getcity()
	{
		return city;
	}
	
	public void setstate(String state)
	{
		this.state=state;
	}
	public String getstate()
	{
		return state;
	}
	
	public void setpinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	public int getpinCode()
	{
		return pinCode;
	}
}