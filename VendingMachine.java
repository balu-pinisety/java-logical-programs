package com.logicalPrograms;

/**
 * @author BALU
 * Program for Fewest Notes to be returned by Vending Machine
 */
public class VendingMachine {

	/**
	 * Asks user to enter the value
	 * @param Rupee
	 * Prints the rupee notes and count of notes
	 */
	public static void main(String[] args) {
		// Asking user to enter the value
		System.out.println("Enter the Rupee req. by Vending machine:");
		int rupee=Utility.getUserInteger();
		int count=0, nmb=0;
		int note[] = {1000, 500, 100, 50, 10, 5, 2, 1};
		// Printing the Notes 
		System.out.println("Notes for the "+rupee+" are");
		for (int i=0; i<note.length; i++) {
			if (rupee/note[i]>0) {
				nmb=Utility.getQuotient(rupee,note[i]);
				System.out.println(note[i]+" * "+nmb);
				rupee=Utility.getRemainder(rupee,note[i]);
				count+=nmb;
			}
		}
		//Printing no.of Notes
		System.out.println("No.of Notes:"+count);
	}
}
