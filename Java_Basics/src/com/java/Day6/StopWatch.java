package com.java.Day6;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter stopwatch start Time : ");
		int start=sc.nextInt();
		
		System.out.println("Enter stopwatch end Time : ");
		int end=sc.nextInt();
		
		int result=end-start;
		
		System.out.println("elapsed time between start & end Stopwatch is : "+result);
		
	}

}
