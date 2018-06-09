package com.practice;

import java.util.Scanner;

public class CalculatorWithString {
	public static void main(String [] args) {
	
	for (;;)	{
	Scanner numbers = new Scanner(System.in);
	Scanner choice = new Scanner(System.in );
	
	System.out.println("What you want to do?");
	System.out.println("Addition, Subtraction, Multiplication, Division...");
	System.out.print("::");
	
	String choose = choice.nextLine();
	
	System.out.print("Enter your 1st number: ");
	double num_1 = numbers.nextDouble();
	
	System.out.print("Enter your 2nd number: ");
	double num_2 = numbers.nextDouble();
	
	if (choose.trim().equalsIgnoreCase("addition"))	{
		
		System.out.println("Result: " + (num_1 + num_2));
	}
	
	else if (choose.trim().equalsIgnoreCase("subtraction")) {
		
		System.out.println("Result: " + (num_1 - num_2));
		
	}
	
	else if (choose.trim().equalsIgnoreCase("multiplication")) {
		
		System.out.println("Result: " + (num_1 * num_2));
		
	}
	
	else if (choose.trim().equalsIgnoreCase("division")) {
		
		System.out.println("Result: " + (num_1 / num_2));
		
	}
	
	else {
		
		System.out.println("Wrong input!!");
		
	}
	
	}
}
}