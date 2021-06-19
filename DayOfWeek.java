package com.logicalPrograms;

/**
 * @author BALU
 * Program to find a week by given date
 */
public class DayOfWeek {

	/**
	 * Asks user to print values of date
	 * @param d,m,y
	 * Prints the week of the date
	 */
	public static void main(String[] args) {
		// Display start message
		System.out.println("Program to find a week day with given date");
		// Asks user to enter the values
		System.out.println("Enter the date of the month ");
		int d=Utility.getUserInteger();
		System.out.println("Enter the month in value");
		int m=Utility.getUserInteger();
		System.out.println("Enter the Year");
		int y=Utility.getUserInteger();
		// Initializing variable and computing values
		int Y=y-(14-m)/12;
		int x=Y+Y/4-Y/100-Y/400;
		int M=m+12*((14-m)/12)-2;
		int D=(d+x+31*M/12)%7;
		// Prints the week
		switch (D) {
		case 0: System.out.println("Sunday");
		break;
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		}
	}
}
