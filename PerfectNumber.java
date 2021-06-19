package com.logicalPrograms;

/**
 * @author BALU
 * Program to check whether given number is Perfect or not
 */
public class PerfectNumber {

	/**
	 * Asks user for number
	 * @param number
	 * Prints whether the user number is perfect or not
	 */
	public static void main(String[] args) {
		// Displays Start Message
		System.out.println("Program for checking Perfect Number");
		// Asking user to Enter the number
		System.out.println("Enter a number to check for perfect or not: ");
		int number = Utility.getUserInteger();
		int sum=0;
		// Finding the factors of the number
		for(int i=1;i<number;i++) {
			if(Utility.getRemainder(number,i)==0) {
				sum+=i;
			}
		}
		// Prints whether the number is perfect or not
		if(sum==number) {
			System.out.println("Given number is a Perfect number");
		} else {
			System.out.println("Given number is not a Perfect number");
		}
	}
}
