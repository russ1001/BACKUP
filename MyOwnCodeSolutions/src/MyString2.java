// This Task2 is the Module 3 coding assignment


/* * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
 * 
 * 
 * 
 * 
 * I also used resources on following two websites: 
 * 
 * https://beginnersgbook.com 
 * https://introcs.cs.princeton.edu/java/32class/
 * 
 * These resources helped me answer some questions more clearly
 * 
 * 
 * 
 * 
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  10/7/18
 * 
 * 
 * 
 * CSCI 275
 * 
 *  
 * Task 2 - Implement the String class                                                  

	The String class is provided in the Java library.
	Provide your own implementation for the following methods (name the new class MyString2):

	• public MyString2(String s);
	• public int compare(String s);
	• public MyString2 substring(int begin);
	• public MyString2 toUpperCase();
	• public char[] toChars();
	• public static MyString2 valueOf(boolean b);

 *
 */

// declare class MyString2
public class MyString2 {

		// declare class data fields 
		private char[] chars;
		private int size;

		
		
		// default constructor for the MyString2 class
		// setting the length and character array size
		public MyString2() {

			size = 0;
			chars = new char[size];
		}
		// close default constructor

		
		
		// MyString2 class constructor that sets the character array chars to the 
		// passed in character array c using the arraycopy function of the System class
		public MyString2(char c[]) {
			
			// set the size variable to the length of the character array c
			size = c.length;
			// set the character array chars with size set by the variable size
	 		chars = new char[size];
	 		// copy character array c starting at index 0 to character array chars at index 0 to size
			System.arraycopy(c, 0, chars, 0, size);
		}
		// close MyString2 constructor

		
		
		// MyString2 class constructor taking in the passed argument
		// and changing the size to the length of the new string
		// and changing the character array chars to the same size
		// 
		public MyString2(String string) {

			// set size to the length of the String string
			size = string.length();
			// set the character array chars with size set by the variable size
			chars = new char[size];
			// convert string to character array using the method .toCharArray
			char c[] = string.toCharArray();
			// pass in characters to character array 
			System.arraycopy(c, 0, chars, 0, size);
		}
		// close MyString2 constructor

		
		
		// method returning the character string as a string
		public String toString() {

			return new String(chars);
		}
		// close toString method
		
		
		
		// MyString2 class constructor creating another instance of MyString2
		// setting the size and character array 
		public MyString2( MyString2 another ){

			// use this. keyword to reference MyString2 class's fields
			// invoking constructors
			this.size = another.size;
			this.chars = another.chars;
		}
		// close MyString2 constructor
		
		
		
		// method that returns the index of a character in the array
		public char charAt(int index){

			return chars[index];
		}	
		// close charAt method
		
		
		
		// method that returns the character array 
		public char[] toChars() {

			return chars;
		}
		// close toChars method
		
		
		
		// MyString2 constructor that converts the character array to uppercase 
		// and returns the new temp character array
		// using a for loop iterating through the character array
		public MyString2 toUpperCase() {

			char[] temp = new char[this.chars.length];
			int k = 0;
			// utilize the this. keyword in the for loop setting the condition 
			// of i< character array chars length from the MyString2 class
			for(int i = 0; i < this.chars.length; i++){
				// utilize the toUpperCase method of the string class
				// utilize again the this. keyword setting the character to uppercase
				temp[k++] = Character.toUpperCase(this.chars[i]);
			}
			// return new character array
			return new MyString2(temp);
		}
		// close MyString2 constructor
		
		
		
		// method to compare the two character arrays
		public int compareTo(MyString2 other){

			size = other.length();
			char comp [] = other.chars;
			int i = 0, j = 0;
			// while loop executing the comparison as long as the counters i and j 
			// are both less than the length of their respective character arrays
			while (i < chars.length && j<comp.length){
				if(chars[i] != comp[j])
					return chars[i] - comp[j];
				// pre-increment both counters
				++i;
				++j;
			}
			if(i<chars.length)
				return 1;
			else if(j<comp.length)
				return -1;
			return 0;
		}
		// close MyString2 constructor
		
		
		
		// boolean method that compares the two character arrays and 
		// if equal returns true, if not false
		public boolean equals(MyString2 other){

			char comp [] = other.chars;
			if(compareTo(other)==0)
				return true;
			return false;
		}
	// close equals method


		// method that returns the index of the specific character
		// using a for loop to iterate through the character array
		public int indexOf(int ch){

			for(int i=0;i<chars.length ;++i){
				if(ch==chars[i])
					return i;
			}
			return -1;
		}
		// close indexOf method



		// MyString2 constructor that returns a substring of the 
		// compared string using a for loop to iterate through
		// the character array 
		public MyString2 subString(int begin){
			// utilize the this. keyword to set length both in 
			// the temp character array and for loop
			char[] temp = new char[this.chars.length-begin];
			int k = 0;
			for(int i = begin; i < this.chars.length; i++){
				temp[k++] = this.chars[i];
			}
			return new MyString2(temp);
		}
		// close MyString2 constructor
		
		
		
		// method to return the length of the character array
		public int length() {

			return size;
		}
		// close length method



		// method to compare the passed in argument string s
		// converting the passed string to a character array
		public int compare(String s) {

			size = s.length();
			char comp [] = s.toCharArray();
			int i = 0, j = 0;
			// while loop executing the comparison as long as the counters i and j 
			// are both less than the length of their respective character arrays
			while (i < chars.length && j<comp.length){
				if(chars[i] != comp[j])
					return chars[i] - comp[j];
				// again pre-increment both counters
				++i;
				++j;
			}
			// compare the length of each
			if(i<chars.length)
				return 1;
			else if(j<comp.length)
				return -1;
			return 0;
		}
		// close compare method



	// main method to test MyString2 class
		public static void main(String args[]){

			// create an instance of the class MyString2 using the string given
			MyString2 myString = new MyString2("Russell");
			System.out.println("The string is: " + myString.toString());
			System.out.println("The string in uppercase is: " + myString.toUpperCase());
			System.out.println("The index of u is " + myString.indexOf('u'));
			System.out.println("The length of the character array is: " + myString.length());
			System.out.println("The substring starting at index 1 is: " + myString.subString(1));
			MyString2 myString1 = new MyString2("Russel");
			System.out.println("Are the two strings Russell and Russel equal?: " + myString1.equals(myString));
			System.out.println("The character at index 0 is: " + myString.charAt(0));

		}
		// close main method

	}
	// close MyString2 class
