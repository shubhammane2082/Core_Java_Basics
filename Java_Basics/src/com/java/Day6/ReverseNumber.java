package com.java.Day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num/=10;
		}
		System.out.println("Reverse Number of given Number is : "+sum);

			
	}

}
