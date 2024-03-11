package com.java.Day6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int N=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		
		int c=0;
		for(int i=0;i<N;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
