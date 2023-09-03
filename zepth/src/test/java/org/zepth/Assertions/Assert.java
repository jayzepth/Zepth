package org.zepth.Assertions;

public class Assert 
{
	public static void Assert1(String Expected, String Actual)
	{
		if(Expected.equals(Actual))
		{
			System.out.println("Result is showing as expected");
		}
		else {
			System.out.println("Result is getting failed");
		}
	}

}
