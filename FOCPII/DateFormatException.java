package com.ncu.assignment.exception;
public class DateFormatException extends Exception
{
	String s2;
	public DateFormatException(String ex2)
	{
		s2=ex2;
		
	}
	public String toString()
	{
		return s2;
	}

}