package com.java.Day6;

public class Binary {

	public static void main(String[] args) 
	{
		int decimal=106;
		String result=Tobinary(decimal);
		System.out.println(result);
		
		System.out.println(Integer.toBinaryString(decimal));

	}

	private static String Tobinary(int decimal) 
	{
		String Binary=" ";
		
		for(int i=31;i>=0;i--)
		{
			int power=(int) Math.pow(2, i);
			
			if(decimal>=power)
			{
				Binary+="1";
				decimal-=power;
			}
			else {
				Binary+="0";
			}
		}
		return Binary;
	}

}
