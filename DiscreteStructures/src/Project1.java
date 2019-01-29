/* CSCI 302  Programming Challenge 1
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  1/20/19
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
 * Programming Challenge 1
For our first program, your task is to write a simple  program that takes as input 2 16-bit 
strings, X and Y. Compute and and display the bitwise AND, bitwise OR, and bitwise XOR of 
the two strings. You may use the programming language of your choice.  
Alternatively, if you do not know a programming language, you may describe your 
algorithm in plain text or pseudocode.  (Appendix 3 of the text describes pseudocode)
Submit a .pdf of your well-documented  source code and your output. 
*/
// import entire java utility to be able to utilize Scanner for user input
import java.util.*;

// declare Project1 class
public class Project1 {
	
// declare main method
	public static void main(String[] args) {
		
		// declare String variables for input via console by user
		// initializing them to null
		String s1 = "";
		String s2 = "";
		// declare character variables to be assigned while iterating through for loop
		char c1, c2;
		// declare String variables and, or, xor to be assigned after the for loop iterates
		// initialized as null Strings
		String and = "";
		String or = "";
		String xor = "";
		// prompt user for input of two 16-bit numbers
		System.out.println("Please enter first number: ");
		Scanner input = new Scanner(System.in);
		s1 = input.next();
		System.out.println("Please enter second number: ");
		s2 = input.next();
		
		//loop through both strings checking each bit in comparison
		for(int i= 0; i<s1.length(); i++) {
			// set char variables c1 & c2 to the character at index i as the loop iterates
			// incrementing each iteration
			c1 = s1.charAt(i);
			c2 = s2.charAt(i);
			// if/else statement checking for AND state in bit
			// if bit at index i in c1 and c2 are 1 then set String variable and to 1 else set it to 0
			if(c1 == '1' && c2 == '1') {
				and += "1";
			}
			else {
				and += "0";
			}
			// if/else statement checking for OR state in bit
			// if bit at index i in c1 or c2 are 1 then set String variable or to 1 else set it to 0
			if(c1 == '1' || c2 == '1') {
				or += "1";
			}
			else {
				or += "0";
			}
			// if/else statement checking for XOR state in bit
			// if bit at index i in c1 is 0 and c2 is 1 or bit at index i in c1 is 1 or c2 is 0
			// then set String variable xor to 1 else set it to 0
			if((c1 == '0' && c2 == '1') || (c1 == '1' && c2 == '0')){
				xor += "1";
			}
			else {
				xor += "0";
			}
		}
		// close input stream assuring no resource leaks
		input.close();
		
		// print to console results of the bitwise check 
		System.out.println("\nThe results of checking the two 16-bit strings are:");
		System.out.println("AND = \t" + and);
		System.out.println("OR = \t" + or);
		System.out.println("XOR = \t" + xor);		
	}
	// close main method
}
// close Project1 class 