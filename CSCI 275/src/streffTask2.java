/*
 * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
 * 
 * 
 * Name: Russell M. Streff Jr.       UID:  362362363       Date:  8/30/18
 * 
 * 
 * 
 * CSCI 275
 * 
 * Task 2 Assignment
 * 
 * Write a test program that prompts the user to enter the number of rows and columns 
 * of a two-dimensional array and then the values in the array and displays true if 
 * the array contains four consecutive numbers with the same value. Otherwise, 
 * display false.
 */






// import entire java utility using the * wildcard callout
import java.util.*;

// declare the class streffTask2 as public
public class streffTask2 {

	// declare the main method
	public static void main(String[] args) {

		// declare the Scanner variable input and set it's input value to the System.in entry from keyboard
		Scanner input = new Scanner(System.in);

		// prompt user to enter the size of the array to hold the numbers
		// of the two dimensional array i.e. enter the number of rows and columns
		System.out.println("Please enter the number of rows of the integer array: ");
		int rows = input.nextInt();
		System.out.println("Please enter the number of columns of the integer array: ");
		int columns = input.nextInt();

		// checking to make sure that the user entered at least row size 4 or column size 4
		// if neither of the values entered are at least than 4 exit the program with error message displayed
		if(rows < 4 && columns < 4) {

			System.out.println("ERROR: You entered a row and column size that was less than 4");
			System.exit(0);
		}
		// close if statement


		// declare the two dimensional integer array game and use the values entered by user via console
		// to set the array size
		int[][] game = new int[rows][columns];

		// prompt user to enter the numerical values into the array
		System.out.println("Please enter the integer values into the array: ");

		// nested for loop to insert numerical values into array
		// iterate through rows first as long as i is less than the array's length
		// increment i by one each time
		for(int i = 0; i < game.length; i++) {
			
			// inner for loop iterating through the columns as long as j is less than the length of array
			// 
			for(int j = 0; j < game[i].length; j++) {

				// insert each inputted integer into the corresponding location in the array
				// at elements game[i][j]
				game[i][j] = input.nextInt();

			}
			// close inner for loop			
		}
		// close outer for loop

		
		
		// print to console message on the results of searching the array for 4 consecutive integers
		System.out.println("\nDoes the below entered array with row length " + rows + " and column length " + columns + " shown below"
							+ " contain any four consecutive integers?");
		
		// print one line for spacing
		System.out.println();
		// print to console the entered matrix
		// using nested for loops iterating through the column length and row length
		for(int i=0; i<game.length; i++) {
			
			for(int j=0; j<game[0].length; j++) {
				
				System.out.print(game[i][j] + "\t");
				// use \t for correct spacing
				
			}
			// close inner for loop
			
			// print one line after each set of iterated row values
			System.out.println();
		}
		// close outer for loop
		

		// close Scanner
		input.close();
		
		
		// call the isConsecutiveFour method from main passing the two-dimensional array game to the method
		isConsecutiveFour(game);
		
		// print one line for spacing
		System.out.println();
		
		// check returned value of the isConsecutiveFour method and print out the answer to console
		if(isConsecutiveFour(game) == true) {
			
			System.out.println("The answer is yes, this array contains four consecutive integers");
		}
		// close if statement
		else 
			System.out.println("The answer is no, this array does not contain four consecutive integers");
	}
	// close main method


	
	
	// initialize and declare the boolean method isConsecutiveFour that will test whether
	// there are 4 consecutive numbers entered into the array by the user
	// by passing in an two dimensional integer array of at least 4x4 array size
	// and assign the array to the array variable called values
	public static boolean isConsecutiveFour(int[][] values) {

		//===================================================================
		// first check rows from left to right, top to bottom
		// using nested for loop
		// outer for loop iterating through the columns as long as i is less than the array length
		// increment i by one each time
		for(int i=0; i<values.length; i++) {
			
			// declare and initialize the integer variable currentValue to the value at 
			// the indexes at values[i][0]
			// and the integer variable consecutiveCount to 0
			int currentValue = values[i][0];
			int consecutiveCount = 0;

			// inner for loop iterating through the counter value j through the length of the array
			for(int j=0; j<values[i].length; j++) {

				// check to see if the value at [i][j] is equal to the current value 
				// if true increment consecutiveCount by one
				if(values[i][j] == currentValue) {

					consecutiveCount++;
					// check to see if the consecutiveCount is 4, if so return true
					
					if(consecutiveCount == 4) return true;
					// return true to the main method
				}
				// close if
				
				// if false set the new currentValue to values[i][j]
				// set the consecutiveCount to 1
				else {

					currentValue = values[i][j];
					consecutiveCount = 1;
				}
				// close else

			}
			// close inner for loop
		} 
		// close outer for loop

		//===================================================================
		// next check columns left to right, top to bottom
		// once again using nested for loop
		// declare and initialize the integer variable currentValue to the value at 
		// the indexes at values[0][j]
		// and the integer variable consecutiveCount to 0
		// outer for loop
		for(int j=0; j<values[0].length; j++) {

			int currentValue = values[0][j];
			int consecutiveCount = 0;
			
			// inner for loop
			for(int i=0; i<values.length; i++) {

				// check to see if the value at [i][j] is equal to the current value 
				// if true increment consecutiveCount by one
				if(values[i][j] == currentValue) {

					consecutiveCount++;
					if(consecutiveCount == 4) return true;
					// check to see if the consecutiveCount is 4, if so return true to the main method
				}
				// close if
				
				// if false set the new currentValue to values[i][j]
				// set the consecutiveCount to 1
				else {

					currentValue = values[i][j];
					consecutiveCount = 1;
				}
				// close else

			}
			// close inner for loop
		}
		// close outer for loop

		
		//===================================================================	
		// Next check diagonals from upper left to lower right
		// iterate through the lower half of array

		// outer for loop iterating through the length of the array
		for (int i = 0; i < values.length; i++) {
			
			// declare and initialize the integer variable currentValue to the value at 
			// the indexes at values[i][0]
			// and the integer variable consecutiveCount to 1
			int currentValue = values[i][0];
			int consecutiveCount = 1;
			
			// inner for loop utilizing j and k as counters
			// iterating as long as j<length of the values array AND k<length of the array
			for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
				
				// check to see if the value at [j][k] is equal to the current value 
				// if true increment consecutiveCount by one
				if (currentValue == values[j][k]) {
					consecutiveCount++;
				}
				// close if
				
				// else set the currentValue to the value of value[j][k]
				// increment consecutiveCount by one
				else {
					currentValue = values[j][k];
					consecutiveCount = 1;
				}
				// close else
				
				// check to see if there is a consecutiveCount of four
				// if so, return true
				if (consecutiveCount == 4) {
					return true;
					// return true to the main method
				}
				// close if
			}
			// close inner for loop
		}
		// close outer for loop
		
		
		
		//===================================================================
		// From upper left to lower right
		// iterate through upper half of array

		// outer for loop iterating through the length of the array at values[0]
		for (int i = 0; i < values[0].length; i++) {
			
			// declare and initialize the integer variable currentValue and 
			// set it's value to the value of values at index[0][i]
			int currentValue = values[0][i];
			
			// declare the integer variable consecutiveCount and set it's value to 1
			int consecutiveCount = 1;
			
			// inner for loop using two counter j and k 
			for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
				
				// if the currentValue is equal to the value at values[k][j]
				if (currentValue == values[k][j]) {
					
					// increment consecutiveCount by one
					consecutiveCount++;
				}
				// close if statement
				// if not, set the currentValue to the value at values[k]j[]
				else {
					currentValue = values[k][j];
					// set consecutiveCount to 1
					consecutiveCount = 1;
				}
				// close else statement

				// if consecutiveCount is equal to 4
				if (consecutiveCount == 4) {
					return true;
					// return true to the main method
				}
				// close if statement
			}
			// close inner for loop
		}
		// close outer for loop

		
		
		//===================================================================
		// From upper right to lower left
		// iterate through upper half of array

		// outer for loop
		for (int i = 0; i < values[0].length; i++) {
			
			// declare and initialize the integer variable currentValue and 
						// set it's value to the value of values at index[0][i]
			int currentValue = values[0][i];
			// declare and set consecutiveCount to 1
			int consecutiveCount = 1;
			// inner for loop
			for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
				
				// if currentValue is equal to the values at [j][k]
				// increment consecutiveCount by one
				if (currentValue == values[j][k]) {
					consecutiveCount++;
				} 
				// if not, set the currentValue to the values at [j][k]
				else {
					currentValue = values[j][k];
					// set consecutiveCount to one
					consecutiveCount = 1;
				}
				if (consecutiveCount == 4) {
					return true;
					// return true to the main method
				}
				// close if
			}
			// close inner for loop
		}
		// close outer for loop
		
		
		//===================================================================
		// From upper right to lower left
		// iterate through lower half of array

		// outer for loop
		for (int i = 0; i < values.length; i++) {
			
			// if currentValue is equal to the values at [i][values.[i].length-1]
			// increment consecutiveCount by one
			int currentValue = values[i][values[i].length-1];
			int consecutiveCount = 1;
			
			// inner for loop
			// use counters j and k to iterate through
			for (int j = i+1, k = values[0].length-2; j < values.length && k >= 0; j++, k--) {
				if (currentValue == values[j][k]) {
					consecutiveCount++;
				} else {
					currentValue = values[j][k];
					consecutiveCount = 1;
				}
				if (consecutiveCount == 4) {
					return true;
				}
				// close if statement
			}
			// close inner for loop
		}
		// close outer for loop
		
		// if all of the checked conditions above do not return true then return false
		// and pass back to the main method
		return false;	

	}
	// close isConsecutiveFour method


}
// close streffTask2 method

