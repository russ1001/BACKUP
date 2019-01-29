/* CSCI 275 Module 7 Task 1 coding assignment
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  12/2/18
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
=============================================================================== 
    Module 7 Task 1 Assignment
===============================================================================
    POSTFIX NOTATION
===============================================================================


Postfix Notation:

Postfix notation is a way of writing expressions without using parentheses. 
For example, the expression (1 + 2) * 3 would be written as 1 2 + 3 *.  
A postfix expression is evaluated using a stack.  
Scan a postfix expression from left to right.  
A variable or constant is pushed into the stack.  
When  an operator is encountered, apply the operator with the top two operands 
in the stack and replace the two operands with the result. The following diagram 
shows how to evaluate 1 2 + 3 *.

|   |	|   |	|   |	|   |	|   |
|   |	| 2 |	|   |	| 3 |	|   |
|_1_|	|_1_|	|_3_|	|_3_|	|_9_|

12+3*	12+3*	12+3*	12+3*	12+3* 
^		 ^		  ^		   ^	    ^	
==========================================================================================

Write a menu driven program to:

A- Evaluate a user input postfix expressions (assume perfect user input at all times)

B- Convert, display infix expressions to postfix expressions then evaluate and display 
   the result of the postfix expression (assume perfect user input at all times)

C- Reads words from a text file (hangman.txt) in a LinkedList and use an iterator 
   on it to display all the words (duplicates allowed) in descending alphabetical 
   order (4 words “tab” separated per line), compare the time to traverse the list 
   using an iterator versus using the get(index) method.

D- Exit

 * 
 * */





// import java util Stack and Scanner 
import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

// declare PostfixInfixLinkedList class
public class PostfixInfixLinkedList {

	// declare time counters for the iterator and get(index) methods
	static long iteratorTimeStart;
	static long iteratorTimeEnd;
	static long iteratorTimeTotal;
	static long getTimeStart;
	static long getTimeEnd;
	static long getTimeTotal;



	// declare main method
	public static void main(String[] args) throws FileNotFoundException {

		// print menu for user to console giving four options to choose		
		System.out.println(" \n Please choose from the following menu options ");
		System.out.println("-----------------------------------------------");
		System.out.println("\n(enter \"A\") Enter a postfix expression to be evaluated (operators after integers)"
				+ "\n\t    (e.g. \"12+3*\" (integer(s)operator(s), etc...)"
				+ "\n\t    This is the same as infix notation of 1+2*3");
		System.out.println("(enter \"B\") Enter & display an infix expression (e.g. 1+2*3), convert to postfix expression " 
				+ "\n\t    then evaluate and display the result of the postfix expression");
		System.out.println("(enter \"C\") Read words from a text file (hangman.txt), display in descending order all words"
				+ "\n\t    (including duplicates) and compare the time to traverse the list"
				+ "\n\t    using an iterator vs. using the get(index) method");
		System.out.println("(enter \"D\") Exit program");
		// declare and initialize String variable choice and set it to null
		String choice = "";
		// declare and set the Scanner variable to the console input
		Scanner input = new Scanner(System.in);
		// assign choice variable to console input 
		choice = input.next();
		// convert user input to uppercase and get only first character in string
		choice = choice.toUpperCase().substring(0,1);
		// switch statement checking the users choice from menu
		switch (choice) {
		case "A":	Scanner input2 = new Scanner(System.in);		
		System.out.println("Please enter your Postfix expression: ");		
		String expression = "";		
		expression = input2.next();				
		System.out.println("Your evaluated postfix expression = " + evaluatePostfix(expression));	main(args);
		case "B": 	Scanner input3 = new Scanner(System.in);		
		System.out.println("Please enter your Infix expression: ");		
		String expression2 = "";		
		expression2 = input3.next();
		System.out.println("The infix notation in postfix form is " + infixToPostfix(expression2)); main(args);		
		case "C":   System.out.println(evaluateFileUsingLinkedList());	main(args);		
		case "D":   System.out.println("Exited program...GOOD BYE");	input.close(); System.exit(1);	break;
		default:	System.out.println("Not a valid entry...please try again");	main(args);			break;
		}
		// close switch statement




	}
	// close main method


	// declare evaluatePostfix method with String being passed in from main method
	public static int evaluatePostfix(String expression) {

		// create Stack of type Integer
		Stack<Integer> stack = new Stack<>();

		// for loop iterating through all characters of string entered
		for(int i=0; i<expression.length(); i++) {

			char ch = expression.charAt(i);
			// if character is an operand push to stack
			if(Character.isDigit(ch)) {
				stack.push(ch - '0');	
			}
			// close if
			// else if character is an operator pop two elements from stack and apply the operator
			else {
				int value1 = stack.pop();
				int value2 = stack.pop();
				// switch statement evaluating the respective operation
				switch (ch) {
				case '+':	stack.push(value2 + value1);	break;
				case '-':	stack.push(value2 - value1);	break;
				case '/':	stack.push(value2 / value1);	break;
				case '*':	stack.push(value2 * value1);	break;
				default:	break;
				}
			}
		}
		// return evaluated postfix expression
		return stack.pop();
	}


	// declare Precedence method for operators for infix to postfix conversion
	static int Precedence(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^': 
			return 3;
		}
		return -1;
	}



	// declare infixToPostfix method with String being passed in from main method
	public static String infixToPostfix(String expression2){

		// declare String result and Stack with type character
		String result = "";
		Stack<Character> stack = new Stack<>();

		// for loop checking to see if the character is a operand or operator
		// and placing in the stack correspondingly
		for(int i=0; i<expression2.length(); i++) {
			char c = expression2.charAt(i);

			if(Character.isLetterOrDigit(c))
				result += c;
			else if(c == '(')
				stack.push(c);
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();

				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Entry";  
				else {
					stack.pop();
				}
			}
			else {
				// checking the precedence of the operators calling the Precendence method
				while(!stack.isEmpty() && Precedence(c) <= Precedence(stack.peek()))
					result += stack.pop();
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
			result += stack.pop();
		// output to console the result of the infix expression calling the evaluatePostfix() method passing result
		System.out.println("\nThe result of your infix expression is " + evaluatePostfix(result));
		return result;

	}
	// close infixToPostfix method





	// declare evaluateFileUsingLinkedList throwing FileNotFoundException 
	public static String evaluateFileUsingLinkedList() throws FileNotFoundException {

		// declaring variables
		String content = "";
		String x = ""; 
		int count = 0;
		int count2 = 0;
		// declaring and setting file to local hangman.txt file
		File file = new File("hangman.txt");
		// declaring Linked List of String type
		LinkedList<String> list = new LinkedList<String>();

		// reading the .txt file into the content String while there is data in file
		try {
			Scanner input = new Scanner(new FileInputStream(file));
			while(input.hasNextLine()) {
				content = input.nextLine();
				list.add(content);
			}
			// print StackTrace if file not found
		}catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
			// catch the exception
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Program terminate safely...");
		}

		// order the file into descending order
		Collections.reverse(list);
		// start timer for iterator
		iteratorTimeStart = System.currentTimeMillis();
		// iterate through the list while there is data
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {

			// print four words to a line tab delimited
			System.out.print(i.next() + "\t");
			count ++;
			if(count == 4) {
				System.out.println();
				count -= 4;
			}
			// end counter and calculate total time
			iteratorTimeEnd = System.currentTimeMillis();
			iteratorTimeTotal = iteratorTimeEnd - iteratorTimeStart;
		}
		System.out.println();
		// start timer for get(index) method
		getTimeStart = System.currentTimeMillis();
		// for loop iterating through the data
		// printing four words to a line tab delimited
		for(int j=0; j<list.size(); j++) {
			System.out.print(list.get(j) + "\t");
			count2 ++;
			if(count2 == 4) {
				System.out.println();
				count2 -= 4;
			}
		}
		// end for loop
		// end timer and calculate total time for get(index) method
		getTimeEnd = System.currentTimeMillis();
		getTimeTotal = getTimeEnd - getTimeStart;
		System.out.println();
		// print to console both times and give the faster method
		System.out.println("Total iterator time = " + iteratorTimeTotal + " miliseconds");
		System.out.println("Total get(index) time = " + getTimeTotal + " miliseconds");
		if(iteratorTimeTotal < getTimeTotal) {
			System.out.println("The iterator time was faster by " + (getTimeTotal - iteratorTimeTotal) + " miliseconds");
		}
		else if(getTimeTotal < iteratorTimeTotal) {
			System.out.println("The get(index) time was faster by " + (iteratorTimeTotal - getTimeTotal) + " miliseconds");
		}
		else {
			System.out.println("The total time was exactly the same!");
		}

		return x;
	}
	// end evaluateFileUsingLinkedList
}
// close PostfixInfixLinkedList class










