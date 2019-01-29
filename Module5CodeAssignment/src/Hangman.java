/* Module 5 Task 1 coding assignment
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  11/1/18
 * ----------------------------------------------------------------------------
 * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
 * 
 * -----------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------
 * RANDOMIZING OF WORDS FOR GUESSES
 * ---------------------------------------------------------------------------------------------------------
 * I declared a String method getWord() to read from the ArrayList words that was generated by the file
 * supplied by the user. The getWord() method randomly generates a word using Math.random multiplying the 
 * words ArrayList size (casting to an integer) to get the random word. The getWord() then returns
 * the randomly generated word to main method
 * ---------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------
 * 
 * 
 * CSCI 275
 * 
 * Module 5 Task 1 Assignment
 * 
 * Write a hangman game.

• The program prompts the user for the words text ﬁle name, throws an exception if it fails to ﬁnd the ﬁle
• The program chooses from the words stored in the text ﬁle in random order and prompts the user 
  to guess one letter at a time
• The words are delimited by newline. Each letter in the word is displayed as an asterisk
• When  the user makes a correct guess, the actual letter is then displayed
• When  the user makes an incorrect guess increment a bad guess counter 
  (display to the user to increase pressure/stress 11 bad guesses = lose)
• When the user finishes a word, display the number of misses and ask the user whether to 
  continue to play with another word
• Reset the bad guess counter for each new word
• Declare an array to store words used and add words used in the game to this array
• When  the user declines to play again print the score (number of wins by user, number of wins by program) 
  and the words used
• In you comment block after the academic integrity statement describe how you are randomizing 
  the choice of words (it must be random) I am looking to see what solution you employ here (1 point)
 */

// Printing visual display to console after each guess, did not get to this but wanted to...
// I just ran out of time to implement this visual...though it would have been kind of nice to try!
// cross bar drawn initially	__
// down bar x 1 miss		  _	| _
// head x 1 miss			   \O/
// body x  1 miss			    |
// left leg x  1 miss		  _/ \_ 
// right leg x  1 miss	      Ouch!						  
// left arm x  1 miss
// right arm x  1 miss
// left foot x  1 miss
// right foot x  1 miss
// left hand x  1 miss
// right hand x  1 miss
//-------------------------
// total misses = 11





// import java libraries: io for input and output of file and util for the Scanner console input 
// using the * wildcard callout for both
import java.io.*;
import java.util.*;

// declare Hangman class
public class Hangman {

	// declare static variables
	// ArrayList words that keeps track of the actual word list
	static ArrayList<String> words = new ArrayList<>();
	// boolean rightGuess keeps track of correct guesses
	static boolean rightGuess;
	// ArrayList usedWords that keeps track of the words used whether a win or lose
	static ArrayList<String> usedWords = new ArrayList<>();
	// counters programWins and userWins keeping track of the respective wins by either user or program
	static int programWins = 0;
	static int userWins = 0;


	// declare the main method
	public static void main(String[] args) throws Exception {

		// getting filename from user via console
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Hangman! Please enter the filename to be used: ");
		String fileName = input.nextLine();


		// getting file
		// declare new File named file
		// insert the user filename named fileName into the new File named file
		// check to make sure that the file supplied exists, if not throw an exception and exit program
		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("Error: File--->\"" + file + "\" not found");
			System.exit(1);
		}
		// close file check if statement


		// reading word file into the ArrayList "words" using the file given by user instead of console 
		// while loop reading data until file is empty
		// throw exception if the file is not found and print stack trace
		try {
			Scanner input2 = new Scanner(file);
			while (input2.hasNext()) {
				words.add(input2.next());
			} 
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}



		// start playing game 
		// initialize keepPlaying variable to "y" to start play
		// while keepPlaying is yes then keep game going otherwise exit game 
		// and print to console wins by user, wins by program, and words used
		Scanner input3 = new Scanner(System.in);
		String keepPlaying = "y";
		while (keepPlaying.equals("y")) {

			// get word from the getWord() method using Math.random()
			String word = getWord();
			// set the String hiddenWord to the hidden word generated by the method getHiddenWord()
			// using the word generated randomly by the getWord() method
			String hiddenWord = getHiddenWord(word);
			// declare and initialize the missed count to zero
			int missCount = 0;

			// while loop that allows the player to continue as long as the word has not been guessed
			// and the missed guess count is not equal to 11 misses per assignment notes
			while (!word.equals(hiddenWord) && (missCount != 11)) {

				System.out.print("\nGuess a letter in the word then press Enter... " + hiddenWord + " > ");
				char ch = input.next().charAt(0);

				// if the character guessed is not in the word then proceed
				if (!isAlreadyInWord(hiddenWord, ch)) {

					// set the String hiddenWord to the guessed word 
					hiddenWord = getGuess(word, hiddenWord, ch);

					// if the guess is incorrect then print to console miss with the character 
					// increment the missed guess by one
					if (!rightGuess) {
						System.out.println("\nMiss! The letter \"" +  ch + "\" is not in the word...try again");
						missCount++;
					}
				} 
				// if the guess is already in the word also increment missed guess by one
				else if(rightGuess){

					System.out.println("\nThe letter \"" + ch + "\" is already in the word...try again");
					missCount++;
				}
			}
			// if the missed guess count is equal to 11 print to console missed message and the word missed
			// increment the number of wins for the program by one and add the missed word to the usedWords ArrayList
			if(missCount == 11) {
				System.out.println("Sorry...you missed 11 times. The word was " + word);
				programWins++;
				usedWords.add(word);

			}
			else {
				// print to console win message, with word guessed and missed count
				// increment the number of wins for the user by one and add the correctly guessed
				// word to the usedWords ArrayList
				System.out.println("\nCongratulations! The word is \"" + word + "\". You missed " + missCount + " times.");
				userWins++;
				usedWords.add(word);
			}
			// close else

			// ask user if he/she wants to continue playing, if y is entered 
			System.out.println("\nWould you like to guess another word? Enter y or n >");
			keepPlaying = input.next();
		}
		// close while loop for continue game

		// print to console the words used during play, wins for user and wins for program
		System.out.println("\nThank you for playing Hangman!" + "\nThe used words were: " + getUsedWords()
		+ "\nYou won " + userWins + " times"+ "\nThe program won " + programWins + " times");
	}
	// close main method

	// getters and setters
	public static ArrayList<String> getUsedWords() {
		return usedWords;
	}

	public static void setUsedWords(ArrayList<String> usedWords) {
		Hangman.usedWords = usedWords;
	}

	public static int getUserWins() {
		return userWins;
	}

	public static void setUserWins(int userWins) {
		Hangman.userWins = userWins;
	}
	// end of getters and setters


	// declare String method getWord to read from the words ArrayList randomly 
	// using Math.random multiplied by the "words" ArrayList size (casting to an integer) to get the random word
	// and returning same word to main method
	public static String getWord() {
		return words.get((int) (Math.random() * words.size()));
	}
	// close getWord method



	// declare String method getHiddenWord passing in the word that was randomly generated by getWord method
	// hiding the word with asterisks using a for loop returning the "hidden" word to caller
	public static String getHiddenWord(String word) {

		String hidden = "";
		for (int i = 0; i < word.length(); i++) {
			hidden += "*";
		}
		return hidden;
	}
	// close getHiddenWord method



	// declare String getGuess method passing in the word, hiddenWord and the character being guessed
	// returning a string that either a) correct guessed character overwriting the asterisk or
	//								  b) an incorrect guessed character keeping the asterisk
	static public String getGuess(String word, String hiddenWord, char ch) {

		rightGuess = false;
		StringBuilder s = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {

			if (ch == word.charAt(i) && s.charAt(i) == '*') {
				rightGuess = true;
				s = s.deleteCharAt(i);
				s = s.insert(i, ch);
			}
		}
		return s.toString(); 
	}
	// close getGuess method




	// declare boolean isAlreadyInWord method checking to see if the character guessed is already in the word
	// returning true or false accordingly
	public static boolean isAlreadyInWord(String hiddenWord, char ch) {

		for (int i = 0; i < hiddenWord.length(); i++) {

			if (ch == hiddenWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	// close isAlreadyInWord method

}
// close Hangman class