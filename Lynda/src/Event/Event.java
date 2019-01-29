package Event;
 
public class Event {

	// instance data
	private String type;
	private int day;
	private int month;
	private int year;
	private int numOfGuests;
	private double cost = 40.00;
	// first letter of the event type
	private char eventNum;
	// to be able to increment the event number
	private static int nextNum;
	private String eventName;
	
	
	
	public Event() {
		
		
	}
	
	
	public Event(String n) {
		
		this.eventName = n;
		
	}
	
	public Event(String n, int d, int m, int y) {
		
		this.eventName = n;
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public Event(String n, int d, int m, int y, int ng) {
		this.eventName = n;
		this.day = d;
		this.month = m;
		this.year = y;
		this.numOfGuests = ng;
	}
	
	
	
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getNumOfGuests() {
		return numOfGuests;
	}


	public void setNumOfGuests(int numOfGuests) {
		this.numOfGuests = numOfGuests;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public char getEventNum() {
		return eventNum;
	}


	public void setEventNum(char eventNum) {
		this.eventNum = eventNum;
	}


	public static int getNextNum() {
		return nextNum;
	}
 

	public static void setNextNum(int nextNum) {
		Event.nextNum = nextNum;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public double EventTotal(int ng, double c){
		
		double total = ng * c;
		
		
		return total;
	}
	
	
	
	public void EventSummary(String t, int d, int m, int y, int ng, double c, char en, int nn, String eSn) {
		
		System.out.println("\nEvent type: " + t + "\nEvent name: "+ eventName + "\nEvent Date: " + d + "-" + m + "-" + y + "\nNumber of guests: "
							+ ng + EventTotal(ng,c) + "\nEvent letter: " + en + nn);
		
		 
		
	}
	
	
	
	
	
	
}
