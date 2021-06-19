package com.logicalPrograms;

/**
 * @author BALU
 * Program to display N terms of Fiboncci series 
 */
public class FibonacciSeries {
	/**
	 * Asking user for number to print series
	 * @param firstTerm, SecondTerm, thirdTerm;
	 * Prints the N terms of series
	 */
	public static void main(String[] args) {
		// Display Start message
		System.out.println("Program for Fibbonacci series");
		// Asking user for the number		
		System.out.println("Enter a number to print Fibonacci series: ");
		int number = Utility.getUserInteger();
		int firstTerm=0, SecondTerm=1, thirdTerm;
		// Prints the terms of series
		System.out.println("Fibonnaci series of first "+number+" terms:");
		System.out.print(firstTerm+" "+SecondTerm+" ");
		for(int i=2;i<number;i++) {
			thirdTerm = firstTerm + SecondTerm;
			firstTerm = SecondTerm;
			SecondTerm = thirdTerm;
			System.out.print(thirdTerm+" ");
		}
	}
}
