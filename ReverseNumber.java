package com.logicalPrograms;

/**
 * @author BALU
 * Program to print the Reverse of a number
 */
public class ReverseNumber {

	/**
	 * Asks user for number
	 * @param number
	 * Print the reverse of given number
	 */
	public static void main(String[] args) {
		// Displays Start Message
		System.out.println("Program for Reversing a Number");		
		// Asking user to Enter the number
		System.out.println("Enter a Number to find reverse: ");
		int number = Utility.getUserInteger();
		int reverse=0;
		// Finding the reverse of number
		while(number != 0)
		{
			int remainder=Utility.getRemainder(number, 10);
			reverse=reverse*10+remainder;
			number /= 10;
		}
		// Print the reverse of given number
		System.out.println("The reverse of given number is "+reverse);
	}
}
