package org.testing.assertions;

public class Assertt
{
	public static boolean assert1(String expected, String actual) 
	{
		if(expected.equals(actual))
		{
			System.out.println("Expected and actual are equal");
			return true;
		}
		else
		{
			return false;
		}
	
	}
}
