package com.java.Day3;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] a= {2,3,2,1,2,23,5,65,98,67};
		
		int max1=0;
		int max2=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max1)
			{
				max1=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=max1 && max2<a[i])
			{
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
