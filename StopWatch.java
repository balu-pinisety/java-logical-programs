package com.logicalPrograms;
/**
 * @author BALU
 * Program for StopWatch
 */
public class StopWatch {

	/**
	 * Asking User to Enter character and then Press ENTER
	 * By clicking ENTER the Stopwatch starts and stop 
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Asking user to enter to start or stop the Stopwatch
        System.out.println("Press any character and press Enter to START the stopwatch");
        char startCh=Utility.getUserChar();
        long start = System.currentTimeMillis();
        System.out.println("Enter any character and press Enter to STOP the stopwatch");
        char stopCh=Utility.getUserChar();
        long stop = System.currentTimeMillis();
        float timeElapsed =  (float) (stop - start)/1000;
        System.out.println("Time = " + timeElapsed + " Seconds");
	}

}
