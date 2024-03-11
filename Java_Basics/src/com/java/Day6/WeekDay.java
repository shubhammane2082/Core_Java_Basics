package com.java.Day6;

import java.time.LocalDate;
import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of month : ");
		int m=sc.nextInt();
		
		System.out.println("Enter the value of year: ");
		int y=sc.nextInt();
		
		System.out.println("Enter the value of Day : ");
		int d=sc.nextInt();
		
		int dayofWeek=dayofWeek(m,y,d);
		switch(dayofWeek)
		{
		  case 0: 
			   System.out.println("Sunday");
			   break;
		  case 1: 
			   System.out.println("Monday");
			   break;
		  case 2: 
			   System.out.println("Tuesday");
			   break;
		  case 3: 
			   System.out.println("Wednesday");
			   break;
		  case 4: 
			   System.out.println("Thrusday");
			   break;
		  case 5: 
			   System.out.println("Friday");
			   break;
		  case 6: 
			   System.out.println("Sunday");
			   break;
			   
		}

	}

	private static int dayofWeek(int m, int y, int d) 
	{
		int y0= y -(14-m)/ 12;
		int x= y0 + y0/4 - y0/100 + y0/400;
		int m0=m+12* ((14-m)/12)-2;
		int d0=(d + x + (31*m0)/ 12) % 7;
		
		return d0;
	}

}
