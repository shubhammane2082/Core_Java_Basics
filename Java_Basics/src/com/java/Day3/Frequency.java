package com.java.Day3;

public class Frequency {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,4,5};
		
		for (int i = 0; i < a.length; i++) 
		{	
			int count=1;
			for (int j = i+1; j < i; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			System.out.println(a[i]+" "+count);
			
		}

	}

}
