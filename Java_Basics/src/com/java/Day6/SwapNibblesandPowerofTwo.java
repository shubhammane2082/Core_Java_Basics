package com.java.Day6;

public class SwapNibblesandPowerofTwo {

	public static void main(String[] args) 
	{
		int decimal=26;
		System.out.println(Integer.toBinaryString(decimal));
		
		int swapTwoNibbles= (decimal & 0x0F) << 4| (decimal & 0xF0) >>4;
		System.out.println(swapTwoNibbles);
		
		
		

	}

}
