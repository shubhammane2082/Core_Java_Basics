package com.java.Day6;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("Given Number is Prime Number");
		}
		else {
			System.out.println("Given Number is not Prime Number");
		}


	}

}
