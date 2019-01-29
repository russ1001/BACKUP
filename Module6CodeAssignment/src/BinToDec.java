/* CSCI 275 Module 6 Task 1 coding assignment
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  11/17/18
 * ----------------------------------------------------------------------------
 * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
 * 
 * 
 * 
 * ===========================================================================
 * 
 * Module 6 Task 1 Assignment
 * 
 * CONVERSIONS
 * 
===============================================================================
Decimal to hex, Binary to Decimal, Hex to Decimal, and String permutation:
===============================================================================

Write a recursive method that converts a decimal number into a hex number as a string.  
The method header is:     public static String dec2Hex(int value)

Write a recursive method that parses a binary number as a string into a decimal integer.  
The method header is:     public static int bin2Dec(String binaryString)

Write a recursive method that parses a hex number  as a string into a decimal integer.  
The method header is:     public static int hex2Dec(String hexString)

Write a recursive method to print all the permutations of a string.  
For example, for the string abc, the permutation is:
.            abc
.            acb
.            bac
.            bca
.            cab
.            cba

Define the following two methods. The second is a helper method.
.            public static void displayPermutation(String s)
.            public static void displayPermutation(String s1, String s2)

The first method simply invokes displayPermutation(” ”, s). 
The second method uses a loop to move a character from s2 to s1 and recursively invokes it 
with a new s1 and s2. The base case is that s2 is empty and prints s1 to the console. 


Write a menu driven test program  that prompts the user to choose which of your methods to test out or to exit. 
The user is then to enter his/her choice:

1.  In the case of string permutation they enter a string and the program displays all its permutations, then returns to the menu.

2. In the case of the hex the user enters a hex string and the program displays its decimal equivalent, then returns to the menu.

3.  In the case of the binary the user to enters a binary string and the program displays its decimal equivalent, then returns to the menu.

4.  In the case of the decimal the user to enters a decimal number and the program displays its hex equivalent, then returns to the menu.

5.  Boundary, recursive programs can quickly get out of hand complexity wise, 
prompt the user at the start of your program to set an upper bound on input size, 
warn them of time delay in case of large inputs (say greater than 6 digits or chars).

6.  In the case of exit, display how much time elapsed and the number of recursive calls 
per function requested (bonus 1 point), then the program is to exit without leaking any resources...
 * 
 * 
 * 
 * 
 * */



// import java utility using * wildcard callout
import java.util.*;
// declare BinToDec class extending the test class
public class BinToDec extends TestRecursiveMethods{

	
// declare main method
	public static void main(String[] args) { 
		// start timer
		elapsedTimeStart = System.currentTimeMillis();
// declare input Scanner variable 
		Scanner input = new Scanner(System.in);
// declare integer variable upperBound to check on size limit 		
		int upperBound;		
// print message to console asking user to input upper size limit
// warning of time delays with larger limits
		System.out.println("Recursive programs can quickly get out of hand, please "
				+ "set an upper limit on the digit size");
		System.out.println("If the size is larger than 6 digits you will experience long time delays");
		System.out.println("Enter an upper limit for the length of the binary digits: ");
		// setting upperBound to the next entered data from console
		upperBound = input.nextInt();
		// checking to make sure the upper limit size is not larger than 6
		// if so return to main method of test class
		if(upperBound > 6) {
			System.out.println("ERROR: upper limit too large");
			TestRecursiveMethods.main(args);
		}
		// prompt user to enter binary number to be converted to decimal
		System.out.println("Enter the binary number: ");
		String binary = input.next();
		// end timer and calculate total
		elapsedTimeEnd = System.currentTimeMillis();
		elapsedTimeTotal = elapsedTimeStart - elapsedTimeEnd;
		elapsedTimeOverall += elapsedTimeTotal;
		// call recursive method bin2Dec passing the binary number entered
		// print to console answer and time elapsed
		System.out.println("\nThe binary number " + binary + " is equal to "+ bin2Dec(binary) + " in decimal format"
				+ "\tTotal time was " + elapsedTimeTotal * -1 + " miliseconds");
		System.out.println("=======================================================================================");
		// increment counter for the total of recursive methods called
		countRecursiveCalls++;
		// return to main method of test class
		TestRecursiveMethods.main(args);

	}
// recursive method
	public static int bin2Dec(String binaryString) {

		int str = (binaryString.charAt(0) == '1') ? 1:0;
		if(binaryString.length() == 1) {
			return str;
		}
		// recursive call
		return(int) (Math.pow(2, binaryString.length() - 1) * str + bin2Dec(binaryString.substring(1)));	
	}
	// close recursive method

}
// close BinToDec class
