package com.ncu.assignment.exception;
public class MandatoryMissingException extends Exception
{
	String s1;
	public MandatoryMissingException(String ex1)
	{
		s1=ex1;
		
	}
	public String toString()
	{
		return s1;
	}

}