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



// import java utility using the * wildcard callout
import java.util.*;
// declare HexToDec class extending the test class
public class HexToDec extends TestRecursiveMethods{
	
	// declare the main method
	public static void main(String[] args) {
		// start timer
		elapsedTimeStart = System.currentTimeMillis();
		// declaring and assigning the Scanner variable input
		Scanner input = new Scanner(System.in);
		// declare the upper limit variable upperBound
		int upperBound;	
		// prompt user to enter upper limit size
		// warn of delay times for higher size limits
		System.out.println("Recursive programs can quickly get out of hand, please "
				+ "set an upper limit on the digit size");
		System.out.println("If the size is larger than 6 digits you will experience long time delays");
		System.out.println("Enter an upper limit for the length of the hexadecimal digits: ");
		upperBound = input.nextInt();
		// check upper size limit
		if(upperBound > 6) {
			System.out.println("ERROR: upper limit too large");
			TestRecursiveMethods.main(args);
		}
		
		// prompt user to enter the hex number to be converted
		System.out.println("Enter a hexadecimal number to be converted to decimal: ");
		String hexString = input.next();
		// call recursive method hex2Dec
		// stop timer and calculate total time elapsed
		elapsedTimeEnd = System.currentTimeMillis();
		elapsedTimeTotal = elapsedTimeStart - elapsedTimeEnd;
		elapsedTimeOverall += elapsedTimeTotal;
		System.out.println("\nThe hexadecimal number " + hexString + " in decimal format is " + hex2Dec(hexString)
							+ "\tTotal time was " + elapsedTimeTotal * -1 + " miliseconds");
		System.out.println("==============================================================================");
		// increment counter for the total of recursive methods called
		countRecursiveCalls++;
		// return to main method of the test class
		TestRecursiveMethods.main(args);

	} 
	// close main method
	// recursive method with the hex number passed in as a string
	public static int hex2Dec(String hexString) {
		// declare and initialize int variables  
		int res = 0;
		int index = 0;
		int n = hexString.length() - 1;
		return hex2Dec(hexString, index, n, res);
		
	}
	// recursive helper method 
	public static int hex2Dec(String hexString, int index, int n, int res) {
		
		int decimal = 0;
		if(hexString.charAt(index) >= 'A' && hexString.charAt(index) <= 'F') {
			
			decimal = (hexString.charAt(index) - 'A') + 10;
		}
		else {
			
			decimal = Integer.parseInt(String.valueOf(hexString.charAt(index)));
		}
		decimal *= (int) Math.pow(16, n);
		if(n == 0) {
			return res + decimal;
		}
		else {
			return hex2Dec(hexString, index + 1, n - 1, decimal + res);
		}
		
	}
	// close recursive method

}
// close HexToDec class
