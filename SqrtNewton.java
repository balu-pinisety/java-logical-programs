package com.logicalPrograms;

/**
 * @author BALU
 * Program to find the Square root by Newton method
 */
public class SqrtNewton {

	/**
	 * Asks user for number
	 * @param c
	 * Prints the square root of number
	 */
	public static void main(String[] args) {
		// Display Start message
		System.out.println("Program to find the Square root of a number");
		// Asks user to enter the number
		System.out.println("Enter the number to find sqrt:");
		int c=Utility.getUserInteger();
		double t=c;
		double epsilon = 1e-15;
		// Computing the square root
		while ((double) Math.abs(t-c/t) > epsilon*t ) {
			t=(double) (t+c/t)/2;
		}
		System.out.println("Square root of "+c+" is "+t);
	}
}
