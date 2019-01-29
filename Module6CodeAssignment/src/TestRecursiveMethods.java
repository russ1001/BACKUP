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

Deﬁne the following two methods. The second is a helper method.
.            public static void displayPermutation(String s)
.            public static void displayPermutation(String s1, String s2)

The ﬁrst method simply invokes displayPermutation(” ”, s). 
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
 * */


// import java utility using * wildcard callout
import java.util.*;

// declare the class TestRecursiveMethods
public class TestRecursiveMethods {
	// declare static variable countRecursiveCalls to keep track of the total of times
	// a recursive function was called
	// declare elapsedTimeStart, elapsedTimeEnd, elapsedTimeTotal to track total elapsed time of 
	// recursive methods called
	static int countRecursiveCalls = 0;
	static long elapsedTimeStart;
	static long elapsedTimeEnd;
	static long elapsedTimeTotal;
	static long elapsedTimeOverall;
	
	// declare main method
	public static void main(String[] args) {
		
		
		// declare Scanner variable object 
		// print to console menu for user to choose from
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease choose from the following recursive method options");
		System.out.println("---------------------------------------------------------");
		System.out.println("1: Decimal to Hexadecimal conversion.................(enter 1)");
		System.out.println("2: Binary to Decimal conversion......................(enter 2)");
		System.out.println("3: Hexidecimal to Decimal conversion.................(enter 3)");
		System.out.println("4: Permutations of a String..........................(enter 4)");
		System.out.println("5: Exit Program......................................(enter 5)");
		
		// declare integer variable choice to assign user's choice from menu
		int choice = input.nextInt();
		// declare String userChoice initializing it to null 
		String userChoice = "";
		// switch statement checking for the user's choice from menu and reprinting to console 
		// as confirmation 
		switch(choice) {
		
		case 1: userChoice = "\"Decimal to Hexadecimal conversion\"";						break;
		case 2: userChoice = "\"Binary to Decimal conversion\"";							break;
		case 3: userChoice = "\"Hexidecimal to Decimal conversion\""; 						break;
		case 4: userChoice = "\"Permutations of a string\""; 								break;
		case 5: userChoice = "to exit the program. Thank you for participating, good bye";	break;
		default: 																			break;
		
		}
		// close switch
		// print to console menu choice of user		
		System.out.println("\nYou chose #" + choice + ", " + userChoice);
		// if / else statement checking for user's choice and calling the corresponding class's main method 
		// to start the conversion or permutation
		// exit program if an invalid choice is made
		
		switch(choice) {
		
		case 1: DecToHex.main(args); 									break;
		case 2: BinToDec.main(args); 									break;
		case 3: HexToDec.main(args);									break;
		case 4: PermutationsOfString.main(args); 						break;
		case 5: input.close(); System.out.println("The total number of recursive methods called was " 
				+ countRecursiveCalls);	System.out.println("Total elapsed time for all called recursive methods was " 
				+ elapsedTimeOverall * -1 + " miliseconds");			break;	
		default: System.out.println("ERROR: Invalid Entry");main(args);	break;
		}
		// close switch statement1
	
		
	}
	// close main method
	
}
// close TestRecursiveMethods

