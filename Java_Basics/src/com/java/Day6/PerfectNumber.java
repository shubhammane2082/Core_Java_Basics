package com.java.Day6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		int sum=0;
		
		for (int i = 1; i < num; i++) 
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		if(num==sum)
		{
			System.out.println("Given number is Perfect Number");
		}
		else {
			System.out.println("Given number is not Perfect Number");
		}
	}

}
