/*CSCI 302  Programming Challenge 2
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  1/21/19
 * ----------------------------------------------------------------------------
 * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
===============================================================================
 * Programming Challenge 2

In this Challenge, you will answer the question: Is matrix multiplication commutative?
The purpose of this challenge is to understand matrix multiplication. 
You are going to write a program, (or write it in plain text) 
that multiplies two matrices A and B, and check whether AB=BA. 
Choose  matrices that have different numbers of rows and columns such as A=3x2 and B=2x4.
You may use any programming language, or you may complete the assignment by 
submitting your algorithm in plain text. The purpose is not to see how well you 
program, but to see if you understand matrix multiplication. Document your 
algorithm with comments.
 * 
 */



// import entire java utility for Scanner input for user input
import java.util.*;
// declare Project2 class

public class Project2 {

	// counter to keep track of too many incorrect user attempts while entering row/column size
	static int counter = 0;

	// declare main method
	public static void main(String[] args) {

		// declare integer variables to accept users input for row/column size of matrices
		// initialize to zero
		int m1r = 0;
		int m1c = 0;
		int m2r = 0; 
		int m2c = 0;

		// declare and initialize Scanner variable input to accept user input from console
		Scanner input = new Scanner(System.in);

		// print to console prompts for user to enter row/column sizes of the two matrices
		System.out.println("Enter the row size of Matrix 1: ");
		m1r = input.nextInt();
		System.out.println("Enter the column size of Matrix 1: ");
		m1c = input.nextInt();
		System.out.println("Enter the row size of Matrix 2: ");
		m2r = input.nextInt();
		System.out.println("Enter the column size of Matrix 2: ");
		m2c = input.nextInt(); 

		// test to make sure that the row size of Matrix 1 is equal to the column size of Matrix 2
		// if not, send the user back to main method to try again
		// two matrices cannot be multiplied if m1 row is not equal to m2 column
		if(m1c != m2r) {
			System.out.println("ERROR: The two matrices cannot be multiplied. Row size of Matrix 1 must equal column size of Matrix 2!");
			System.out.println("Please try again...");
			counter ++;
			if(counter == 3) {
				System.out.println("\n\nSorry...too many attempts");
				System.out.println("Please refer to: 'Discrete Mathematics and It's Applications', Rosen, Seventh Edition, Section 2.6 Matrices page 179");
				System.out.println("PROGRAM EXITED");
				System.exit(1);
			}
			// bring user back to main method to try again with row/column size entry, 3 attempts allowed
			main(args); 
		}
		// close if statement

		// declare (2) two-dimensional integer matrices using the row/column sizes entered by user via console
		int [][] matOne = new int[m1r][m1c]; 
		int [][] matTwo = new int[m2r][m2c];

		// prompt user to input values for Matrix 1 "A" by row/column
		System.out.println("Enter the values for Matrix 1 row 1/column1, row1/column2, row n+1/column n+1... :");
		// nested for loop initializing Matrix 1 with users input
		for(int i = 0; i < m1r; i++) {
			for(int j = 0; j < m1c; j++) {

				matOne[i][j] = input.nextInt();
			}
		}

		// prompt user to input values for Matrix 2 "B" by row/column
		System.out.println("Enter the values for Matrix 2 row 1/column1, row1/column2, row n+1/column n+1... :");
		// nested for loop initializing Matrix 1 with users input
		for(int i = 0; i < m2r; i++) {
			for(int j = 0; j < m2c; j++) {

				matTwo[i][j] = input.nextInt();
			}
		}

		// call multiplyMatrices method passing the two entered matrices 
		// along with their corresponding row/column sizes
		multiplyMatrices(matOne, matTwo, m1r, m1c, m2r, m2c);

		input.close();
		// close input stream assuring no resource leaks
	}
	// close main method

	// declare multipyMatrices method taking in the row/column sizes entered by user
	// and returning the product of the two matrices
	public static int [][] multiplyMatrices(int [][] mat1, int [][] mat2, int m1r, int m1c, int m2r, int m2c){

		// declare new integer two-dimensional matrix "matProductAB" initializing the row/column 
		// size to the row/column values passed to this method from main method entered by user
		int [][] matProductAB = new int[m1r][m2c];
		// nested for loop that will iterate through the matrices using i,j,k integer counters
		// getting the sum of the products for "AB"
		// the second product matrix matProductBA below will do the same process except for "BA"

		// the iteration starts at Matrix 1(row 1,column 1) 
		// and multiplies that term by Matrix 2(column 1,row 1)
		// The product matrix "matProductAB" rows/columns are the counter indexes i,j. 
		// The product of each iteration is
		// added together to the previous product(s) using the += operator.
		// Each iteration through the triple nested for loop increments 
		// the counters by one (i+1, j+1, k+1) walking through each element of Matrix 1 & Matrix 2. 
		// Matrix 1 row n column m is multiplied by Matrix 2 column m row n;
		// after the first run through, each subsequent iteration
		// performs the same function Matrix 1(row n+1,column m+1) x Matrix2(column m+1,row n+1)
		// adding the product to the previous product(s)
		for(int i = 0; i < m1r; i++) {
			for(int j = 0; j < m2c; j++) {
				for(int k = 0; k < m1c; k++) {

					matProductAB[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		// close nested for loop

		// print to console the product of Matrix 1 and Matrix 2
		// referred to in the Program challenge as "AB"
		System.out.println("\nThe product of the two matrices \"AB\" entered is: ");
		System.out.println("----------------------------------------------------");
		for(int[] row : matProductAB) {
			for (int column : row) {
				System.out.print("\t" + column + "    ");
			}
			System.out.println();
		}

		// declare new integer two-dimensional matrix "matProductBA" initializing the row/column 
		// size to the row/column values passed to this method from main method entered by user
		// this is obviously the same matrices but now instead of AB it is multiplying BA
		// to see if the two products of the matrix multiplication are equal (commutative)
		// which they are not
		int [][] matProductBA = new int[m2r][m1c];

		// nested for loop that will iterate through the matrices using i,j,k integer counters
		// getting the sum of the products for "BA"
		// the second product matrix matProductBA below will do the same process except for "BA"
		// the iteration starts at Matrix 2(row 1,column 1) 
		// and multiplies that term by Matrix 1(column 1,row 1)
		// The product matrix "matProductBA" rows/columns are the counter indexes i,j. 
		// The product of each iteration is
		// added together to the previous product(s) using the += operator.
		// Each iteration through the triple nested for loop increments 
		// the counters by one (i+1, j+1, k+1) walking through each element of Matrix 1 & Matrix 2 
		// multiplying Matrix 1 row n column m by Matrix 2 column m row n
		// after the first run through, each subsequent iteration
		// performs the same function Matrix 1(row n+1,column m+1) x Matrix2(column m+1,row n+1)
		// adding the product to the previous product(s)
		for(int i = 0; i < m2r; i++) {
			for(int j = 0; j < m1c; j++) {
				for(int k = 0; k < m2c; k++) {

					matProductBA[i][j] += mat2[i][k] * mat1[k][j];
				}
			}
		}

		// print to console the product of Matrix 2 and Matrix 1
		// referred to in the Program Challenge as "BA"
		System.out.println("\nThe product of the two matrices \"BA\" entered is: ");
		System.out.println("----------------------------------------------------");
		for(int[] row : matProductBA) {
			for (int column : row) {
				System.out.print("\t" + column + "    ");
			}
			System.out.println();
		}

		// print to console the results after viewing the products of the two matrices
		System.out.println("\nAS SEEN BY VIEWING THE PRODUCTS OF THE TWO MATRICES \"AB\" AND \"BA\"...");
		System.out.println("it is clear that the two matrices multiplied, Matrix 1 (AB) x Matrix 2 (BA) "
				+ "is not Commutative (AB != BA)");


		// return matProductAB to calling function in main method for potential use in other functions
		return matProductAB;
	}
	// close multiplyMatrices method
}
// close Project2 class




