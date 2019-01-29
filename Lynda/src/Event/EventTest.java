

package Event;

import java.util.*;
public class EventTest {

	public static void main(String[] args) {
		
		String type = "";
		int nofguests = 0;
		int day;
		int month;
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type of event: ");
		type = input.nextLine();
		System.out.println("Enter the number of guests: ");
		nofguests = input.nextInt();
		System.out.println("Enter the day, month and year of the event: ");
		day = input.nextInt();
		month = input.nextInt();
		year = input.nextInt();
		
		input.close();
		
		Event event = new Event(type, nofguests, day, month, year);
		event.toString();
		
		
		
		
	}
}
