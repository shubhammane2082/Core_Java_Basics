package com.java.Day6;

import java.util.Scanner;

public class Payment {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		int p=sc.nextInt();
		System.out.println("Enter No. of year : ");
		int y=sc.nextInt();
		System.out.println("Enter Rate of Intrest : ");
		double R=sc.nextDouble();
		
		double payment=MonthlyPayment(p,y,R);
		System.out.println(payment);
		
	}

	private static double MonthlyPayment(int p, int y, double R) 
	{
		int n=12*y;
		
		double r=(R/12)*100;
		
		double result=Math.pow(1+r,(-n));
		
		double ans=(p*r)/(1-result);
		
		return ans;
	}

}
