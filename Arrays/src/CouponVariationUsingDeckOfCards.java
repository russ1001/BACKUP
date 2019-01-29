// keeps track of how many times 


public class CouponVariationUsingDeckOfCards {


	public static void main(String[] args) {
		
		final int NUMBER_OF_CARDS = 52;
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		boolean[] found = new boolean[4];
		
		int numberOfPicks = 0;
		int count = 0;
		
		while(count<4) {
			
			numberOfPicks++;
			int index = (int) (Math.random() * NUMBER_OF_CARDS);
			
			if(!found[index/13]) {
				
				found[index/13] = true;
				count++;
				
				String suit = suits[index / 13];
				String rank = ranks[index % 13];
				System.out.println(rank + " of " + suit);
		
				
			}
			
		}
		
		System.out.println("Number of picks: " + numberOfPicks);
		
		
		
		
	}
	
	
	
}
