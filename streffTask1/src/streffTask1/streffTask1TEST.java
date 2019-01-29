package streffTask1;

import java.util.Scanner;

import streffTask1.streffTask1.Location;

public class streffTask1TEST {
 

public static void main(String[] args) {

	// declare and assign the Scanner variable input and set its assignment to the System.in 
	// and the input from console
	Scanner input = new Scanner(System.in);
	// prompt user to enter row and column size
	System.out.println("Enter the row and column size of the array (these values must be of integer type): ");
	// declare and assign the row and column values to the next inputted values from console
	int row = input.nextInt();
	int column = input.nextInt();
	// declare a two-D array named data and assign its size using the row and column data entered by user
	double data[][] = new double[row][column];
	// prompt user to enter array values via console
	System.out.println("Enter your array values: ");
	// nested for loop assigning each entered value to the next element location in the 2-D array
	for(int i=0; i<data.length; i++) {
		for(int j=0; j<data[i].length; j++) {

			data[i][j] = input.nextDouble();
		}
		// close inner for loop
	}
	// close outer for loop

	// close Scanner input
	input.close();

	System.out.println();
	// print one line for spacing purposes

	// print out entered array using nested for loop
	System.out.println("The entered two-dimensional array is:");
	System.out.println("=====================================");
	for(int i=0; i<data.length; i++) {
		for(int j=0; j<data[i].length; j++) {

			System.out.print(data[i][j] + "\t");
		}
		System.out.println();
	}
	// close outer for loop


	// create a new instance of the Location class and pass the entered
	// 2-D array data to it
	Location location = Location.locateLargest(data); 

	// print out results that the Location class passed back to main method
	// displaying the maxValue and the location in the array
	System.out.println("\nThe number of the largest value in the array is " + location.maxValue
			+ " and it is located at [" + location.row + ", " + location.column + "] in the array.");
	}
// close main method
}
// close streffTask1TEST method