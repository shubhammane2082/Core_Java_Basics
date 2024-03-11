package com.java.Day3;

public class Evenposition {

	public static void main(String[] args) {
		
		int[] a= {123, 312, 415, 617, 789, 567, 765};
		
		for (int i = 0; i < a.length; i++) 
		{
			if(i%2==0)
			{
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
