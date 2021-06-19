package com.logicalPrograms;

/**
 * @author BALU
 * Program to find the Monthly payment
 */
public class monthlyPayment {

	/**
	 * Asks user to enter the values
	 * @param args
	 * Calculates the monthly payment
	 */
	public static void main(String[] args) {
		// Displays Start Message
		System.out.println("Program for monthly payment of loan that compounded annually");
		// Asks user to enter the values
		System.out.println("Enter the Priniciple amount:");
		int P=Utility.getUserInteger();
		System.out.println("Enter the No.of Years to payoff:");
		int Y=Utility.getUserInteger();
		System.out.println("Enter the Rate of Interest:");
		int R=Utility.getUserInteger();
		int n=12*Y;
		double r=R/(12*100);
		double pay=P*r/(1-Math.pow(1+r,-n));
		System.out.println("Monthly payment to payoff loan is "+pay);
	}
}
