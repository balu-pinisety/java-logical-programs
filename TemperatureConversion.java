package com.logicalPrograms;

/**
 * @author BALU
 * Program for Unit conversion of degF to  degC and vice-versa
 */
public class TemperatureConversion {

	/**
	 * Asks user to select the conversion
	 * Asks user to enter the value
	 * @param args
	 * Prints the converted value
	 */
	public static void main(String[] args) {
		// Display Start Message
		System.out.println("Program for Unit conversion of degF to  degC and vice-versa");
		// Asks user to Select the conversion
		System.out.println("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius\nChoose the conversion from above: ");
		int number=Utility.getUserInteger();
		switch (number) {
		case 1: System.out.println("Enter the value of Celsius: ");
				int C=Utility.getUserInteger();
				degC_degF(C);
				break;
		case 2: System.out.println("Enter the value of Fahrenheit ");
				int F=Utility.getUserInteger();
				degF_degC(F);
		}
	}
	
	// Conversion of Celsius to Fahrenheit
	public static void degC_degF(int temp) {
		double F=(double)(temp*9/5)+32;
		System.out.println(temp+" Celsius in Fahrenheit is "+F);
	}
	
	// Conversion of Fahrenheit to Celsius
	public static void degF_degC(int temp) {
		double C=(double)(temp-32)*5/9;
		System.out.println(temp+" Fahrenheit in Celsius is "+C);
	}
}

