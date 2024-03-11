package com.java.Day5;

import java.util.Scanner;

public class Flipcoin 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of flip coins : ");
		int Numflipcoins=sc.nextInt();
		
		if(Numflipcoins<=0)
		{
			System.out.println("Please enter positive Integer value");
			return;
		}
		int headCount=0;
		int Tailcount=0;
		
		for (int i = 0; i < Numflipcoins; i++) 
		{
			double randomNumber=Math.random();
			if(randomNumber<0.5)
			{
				Tailcount++;
			}
			else {
				headCount++;
			}
		}
		double headPercentage=(headCount*100)/Numflipcoins;
		double TailPercentage=(Tailcount*100)/Numflipcoins;
		
		System.out.println("Percentage for Head count is : "+headPercentage);
		System.out.println("Percentage for Tail count is : "+TailPercentage);
	}

}
