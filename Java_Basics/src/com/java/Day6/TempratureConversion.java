package com.java.Day6;

import java.util.Scanner;

public class TempratureConversion {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("choice conversion : ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		   case 1 :
			   
			   System.out.println("Enter the temperature in celsius : ");
			   int temp=sc.nextInt();
			   int farenheit=convertcf(temp);
			   System.out.println("Temperature in Farenheit is : "+farenheit);
			   break;
			   
		   case 2: 
			   System.out.println("Enter the temperature in Farenheit : ");
			   int temp1=sc.nextInt();
			   int celsius=convertfc(temp1);
			   System.out.println("Temperature in celsius is : "+celsius);
			   break;
			   
		}
		

	}
	
	public static int convertcf(int temp)
	{
		int result=(temp*9/5)+32;
		return result;
	}
	
	public static int convertfc(int temp)
	{
		int result= ((temp-32)*5/9);
		return result;
	}

}
