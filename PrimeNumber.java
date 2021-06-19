package com.logicalPrograms;

/**
 * @author BALU
 * Program to check whether given number is Prime or not
 */
public class PrimeNumber {

	/**
	 * Asks user for number
	 * @param number
	 * Prints whether the user number is prime or not
	 */
	public static void main(String[] args) {
		// Displays Start Message
		System.out.println("Program for to check Prime Number");
		// Asking user to Enter the number
		System.out.println("Enter a number to check for prime: ");
		int number = Utility.getUserInteger();
		int flag=0;
		// Computing to check Prime
		if(number<=0||number==1) {
			System.out.println(number+"is not a prime number");
		} else {
			for(int i=2;i<number;i++) {
				if(Utility.getRemainder(number,i)==0) {
					flag=1;
					break;
				}
			}
		}
		// Prints whether the number is prime or not
		if(flag==0) {
			System.out.println(number+" is a prime");
		} else {
			System.out.println(number+" is not prime");
		}
	}
}
