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



// import entire java utility using * wildcard callout
import java.util.Scanner;
// declare DecToHex class that extends the recursion test class
public class DecToHex extends TestRecursiveMethods{
	
// declare main method	
	public static void main(String[] args) {
		// start timer		
		elapsedTimeStart = System.currentTimeMillis();
		// declare Scanner object setting it to the System.in from console
		Scanner input = new Scanner(System.in);
		// declare upperBound variable to check the user input for upper limit 	
		int upperBound;	
		// print message to console asking user to enter upper limit
		// warn of time delays
		System.out.println("Recursive programs can quickly get out of hand, please "
				+ "set an upper limit on the digit size");
		System.out.println("If the size is larger than 6 digits you will experience long time delays");
		System.out.println("Enter an upper limit for the length of the decimal digits: ");
		// set upperBound to the next console input
		upperBound = input.nextInt();
		// check if limit is 6 or less, if larger return error and go back to main method 
		// in the TestRecursiveMethods class, start over
		if(upperBound > 6) {
			System.out.println("ERROR: upper limit too large");
			TestRecursiveMethods.main(args);
		}
		// prompt user to enter decimal to be converted		
		System.out.println("Enter a decimal number to be converted to hexadecimal: ");
		// set integer variable num to the next console input
		int num = input.nextInt();
		// end timer and calculate total time elapsed		
		elapsedTimeEnd = System.currentTimeMillis();
		elapsedTimeTotal = elapsedTimeStart - elapsedTimeEnd;
		elapsedTimeOverall += elapsedTimeTotal;
		// call recursive method dec2Hex passing the number entered by user
		// print to console answer and total elapsed time
		System.out.println("\nThe decimal number " + num + " in hexidecimal format is " 
		+ dec2Hex(num) + "\tTotal time was " + elapsedTimeTotal * -1 + " miliseconds");
		System.out.println("==========================================================================");
		// increment counter for recursive calls
		countRecursiveCalls++;
		// return to main method of test class
		TestRecursiveMethods.main(args);
		
	}
	
	// Method converts a decimal number into a hex number as string 
	public static String dec2Hex(int value) {
		String result = "";
		return dec2Hex(value, result);
	}

	// Recursive helper method 
	public static String dec2Hex(int value, String result) {
		// remainder
		int r = value % 16;
		String remainder = r >= 10 ? 
			String.valueOf((char)('A' + r % 10)) : String.valueOf(r);
		// base case	
		if (value / 16 == 0)
			return remainder + result;
		else
			// recursive call
			return dec2Hex(value / 16, remainder + result); 
	}
	// close helper method
}
// close DecToHex class
