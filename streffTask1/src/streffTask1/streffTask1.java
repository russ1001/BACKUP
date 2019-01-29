/* * I declare that all material in this assessment task is my own work
	 * except where there is clear acknowledgment or reference to the work
	 * of others. I further declare that I have complied with, and agree to
	 * abide by, the UIS Academic Integrity Policy at the University website: 
	 * 
	 * 					http://www.uis.academicintegrity
	 * 
	 * 
	 * Name: Russell M. Streff Jr.       UIN:  362362363       Date:  9/22/18
	 * 
	 * 
	 * 
	 * CSCI 275
	 * 
	 * Module 2 Coding Assignment
	 * 
	 * Task 1 - The Location class			5 points


	 */
package streffTask1;

import java.util.Scanner;

public class streffTask1 {
	
	
	

	// declare the Location class
	static class Location {
		// declare the data fields for the Location class as public
		public int row;
		public int column;
		public double maxValue;

		// default constructor of the Location class
		public Location() {

		}

		// constructor of the Location class initializing the row, column and maxValue
		// with the arguments passed from the calling method using the this. function
		public Location(int row, int column, double maxValue) {

			this.row = row;
			this.column = column;
			this.maxValue = maxValue;
		}

		// declare the method locateLargest within the Location class
		// with a two-dimensional array being passed in from the calling method
		// public so that it will be visible from classes in other packages
		// static so that it may be shared among all instances of the class 
		public static Location locateLargest(double[][] data) {

			// declare and initialize the int variables row & column to zero
			// declare and initialize the double variable maxValue to the 
			// two-dimensional array element at [row][column]
			int row = 0;
			int column = 0;
			double maxValue = data[row][column];

			// nested for loop that iterates through each element of the two-D array 
			// testing for the maximum value and when finding it assigns that max value 
			// to the corresponding element location in the array
			// if it the current element is not greater than the maxValue 
			// row and column are incremented accordingly leaving maxValue the same
			for(int i=0; i<data.length; i++) {
				for(int j=0; j<data[i].length; j++) {

					if(maxValue < data[i][j]) {

						maxValue = data[i][j];
						row = i;
						column = j;
					}
					// close if statement
				}
				// close inner for loop
			} 
			// close outer for loop

			// return a new instance of the Location class to the calling method
			return new Location(row, column, maxValue);
		}
		// close the method locateLargest 

	}
	//close class Location
}
// close streffTask1 class
 