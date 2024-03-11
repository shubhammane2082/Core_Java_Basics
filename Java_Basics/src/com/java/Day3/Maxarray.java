package com.java.Day3;

public class Maxarray {

	public static void main(String[] args) {
		int[] a= {1,213,113,45,67,98};
		
		int max=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
