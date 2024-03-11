package com.java.Day3;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		System.out.print("Enter Array Elements : ");
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		
		for (int i = 0; i <a.length ; i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
