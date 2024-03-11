package com.java.Day3;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {223,32,445,667,123};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(min);

	}

}
