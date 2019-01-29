

// ArrayList if part of the java.util package

public class ArrayList {
	
	public static void main(String[] args) {
		
		// create ArrayList object called cityList using the default constructor
		java.util.ArrayList cityList = new java.util.ArrayList();
		
		// add elements to the ArrayList cityList
		// ArrayLists keep track of the array in the order that they were entered
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		// the ArrayList cityList now contains
		// London, Denver, Paris, Miami, Seoul and Tokyo
		
		
		// size of ArrayList
		System.out.println("List size? " + cityList.size());
		// check to see if a String is an element
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		// where in the list is the object, looking for the index
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		// find out if the list is empty
		System.out.println("Is the list empty? " + cityList.isEmpty());
		System.out.println();
		
		// add an item into the list at a specific location
		cityList.add(2,  "Xian");
		// London, Denver, Xian, Paris, Miami, Seoul and Tokyo
		
		// remove an item from the list
		cityList.remove("Miami");
		// London, Denver, Xian, Paris, Seoul and Tokyo
		
		// remove an item at a specific index
		cityList.remove(1);
		// London, Xian, Paris, Miami, Seoul and Tokyo
		
		// print out all the elements of the list
		System.out.println("The elements in cityList are: \n" + cityList.toString());
		
		// print out the contents in reverse order
		System.out.println("\nThe elements in cityList in reverse are: ");
		for(int i=cityList.size()-1; i>=0; i--) {
			System.out.print(cityList.get(i) + " ");
			
		}
		System.out.println();
		
		
		// use classes from other projects
		// create a new ArrayList called list
		java.util.ArrayList list = new java.util.ArrayList();
		
		// add a circle from the CircleClass Project
		list.add(new Circle(2));
		list.add(new Circle(4));
		
		// ArrayList stores objects if we want to use any of the Circle's methods we need to typecast
		System.out.println();
		System.out.println("The area of the circle using project Circle's methods?\n " + ((Circle)list.get(0)).getArea());
		
	
		
		
		
		
		
		
		
	}

}
