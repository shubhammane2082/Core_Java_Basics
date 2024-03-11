package com.java.Day3;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,1,2,3};
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
