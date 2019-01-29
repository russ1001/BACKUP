


public class DeckOfCards {
	

	public static void main(String[] args) {
		// declare and initialize deck array to size 52
		int[] deck = new int[52];
		// declare and initialize suits and ranks String arrays with the correct data
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// initialize the array with 0-51
		// initialize the deck with a random value 
		// set the deck at index i = i
		
		for(int i=0; i<deck.length; i++) {
			
			deck[i] = i; 
			
		}
		
		
		// shuffle the deck
		// for each card generate a random index and then swap the card with the one at that index that was just generated
		for(int i=0; i<deck.length; i++) {
			
			// Math.random generates random doubles from 0.0 - 1.0
			// we multiply by the deck length to get the correct range of 0-51
			// type cast then to an int
			int index = (int) (Math.random() * deck.length);
			
			// swap the variable to shuffle the deck
			// create and initialize a temp variable and set it to deck[i]
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		
		
		// print out the four cards
		for(int i=0; i<5; i++) {
			
			// use division and modulus to get the suits and ranks of the cards
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			
			// print out card number, rank and suit
			System.out.println("Card number " + deck[i] + ":  " +  rank + " of " + suit);
			
		
		
		}
	
	}

}
