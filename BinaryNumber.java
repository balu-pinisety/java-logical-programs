package com.logicalPrograms;

/**
 * @author BALU
 * Program to find the Binary number
 */
public class BinaryNumber {

	/**
	 * Asks Use for number
	 * @param args
	 * Prints the Binary number
	 */
	public static void main(String[] args) {
		// Asks user to Enter the Number
		System.out.println("Enter the number to find binary value:");
		int number=Utility.getUserInteger();
		int Binary=0,Sum=0;
		// Computing to find the Binary Number
		while(number>0) {
			for(int i=0; i<number; i++) {
				if (number == (int)Math.pow(2,i)) {
					Sum=(int) Math.pow(10,(i));
					Binary+=Sum;
					number-=(int) Math.pow(2,(i));
					break;
				} else if (number < (int)Math.pow(2,i)) {
					Sum=(int) Math.pow(10,(i-1));
					Binary+=Sum;
					number-=(int) Math.pow(2,(i-1));
					break;
				}
			}
		}
		// Prints the Binary value
		System.out.println("Binary value of given number is "+Binary);
	}
}
