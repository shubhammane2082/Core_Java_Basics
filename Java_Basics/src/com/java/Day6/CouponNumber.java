package com.java.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CouponNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of N : ");
		int N=sc.nextInt();
		
		int randomNumber=generateRandomNumbers(N);
		System.out.println(randomNumber);
		
		int DistinctcouponNumbers=DistinctcouponNumbers(N);
		System.out.println("Total Numbers need to generate "+N+ " distinct coupon count is : "+DistinctcouponNumbers);
		
	}
	
	public static int generateRandomNumbers(int n)
	{
		return(int) (Math.random()*n+1);
	}
	
	public static int DistinctcouponNumbers(int n) 
	{
		Set<Integer> couponSet=new HashSet<>();
		int count=0;
		
		while(couponSet.size()<n)
		{
			int coupon=generateRandomNumbers(n);
			couponSet.add(coupon);
			count++;
		}
		return count;
		
		
	}

}
