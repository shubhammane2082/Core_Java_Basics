package com.java.Day6;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the change notes : ");
		int changeNotes=sc.nextInt();
		
		int[] notes= {500,100,5,2,1};
		for(int i=0;i<notes.length;i++)
		{
			int count=(changeNotes/notes[i]);
			if(count>0)
			{
				System.out.println("Notes : "+notes[i]+" No of Notes : "+count);
				changeNotes=changeNotes%notes[i];
			}
			
		}
		

	}

}
