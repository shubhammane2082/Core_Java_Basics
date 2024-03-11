package com.java.Day3;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {23,2,4,67,66,8,10,6};
		
		for(int i=0;i<a.length;i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.print(a[i]+" ");
		}

	}

}
