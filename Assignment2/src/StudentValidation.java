package com.ncu.assignment.validation;
import com.ncu.assignment.exception.*;
public class StudentValidation
{
	public static void Exception1(String st1) throws MandatoryMissingException
	{
		if(st1.equals(""))
			{
				throw new MandatoryMissingException(StudentValidationMessage.mme);
			}
	}
	public static void Exception2(int size) throws MandatoryMissingException
	{
		if(size<=0)
			{
				throw new MandatoryMissingException(StudentValidationMessage.se);
			}
	}
}