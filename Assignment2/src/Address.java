package com.ncu.assignment;
public class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;
	
	public void setline1(String line1)
	{
		this.line1=line1;
	}
	public String getline1()
	{
		return line1;
	 }
	
	public void setline2(String line2)
	{
		this.line2=line2;
	}
	public String getline2()
	{
		return line2;
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