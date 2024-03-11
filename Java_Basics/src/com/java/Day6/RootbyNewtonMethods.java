package com.java.Day6;

import java.util.Scanner;

public class RootbyNewtonMethods {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of c : ");
		double c=sc.nextDouble();
		
		double result=sqrt(c);
		System.out.println("Square root : "+result);

	}

	private static double sqrt(double c) 
	{
		double t=c;
		
		double epsilon=1e-15;
		
		while(Math.abs(t-c/t)>(epsilon*t))
		{
			t=(c/t + t)/2.0;
		}
		return t;
	}

}
