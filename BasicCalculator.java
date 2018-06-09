package com.practice;
import java.util.Scanner;

public class BasicCalculator {
	
	public static void main(String []args) {

		double  num_1, num_2, result;
		int choice;
		
		Scanner number = new Scanner (System.in);
		Scanner selection = new Scanner (System.in);
		
			System.out.println("Addition press-1 , Subtraction press-2, Multiplication press-3, Division press-4");
			System.out.print("you choice is: ");
			choice = selection.nextInt();
		
			System.out.print("what is your 1st number: ");
			num_1 = number.nextDouble();
		
			System.out.print("What is your 2nd number: ");
			num_2 =  number.nextDouble();
		
		if(choice == 1) {
			result = num_1 + num_2;
			System.out.println("result: " + result);
		}
		
		else if (choice == 2) {
			result = num_1 - num_2;
			System.out.println("result: " + result);
		}
		
		else if (choice == 3) {
			result = num_1 * num_2;
			System.out.println("result: " + result);
		}
		
		else if (choice ==4) {
			result = num_1 / num_2;
			System.out.println("result: " + result);
		}
		
			System.out.println("Thanks for using my calculator");	
	}
	
}
