import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GroveryList {
	
	public static void main(String[] args) {
		
		ArrayList<String> groceries1 = new ArrayList<>(Arrays.asList("milk","bread","cheese"));
		ArrayList<String> groceries2 = new ArrayList<>(Arrays.asList("sugar","flour","baking soda"));
		ArrayList<String> shopping1 = new ArrayList<>(Arrays.asList("running shoes","socks","jacket","shorts","shirt","hat"));

		
		groceries1.add("bacon");
		groceries1.addAll(groceries2);
		System.out.println(groceries1);
		
		groceries1.addAll(shopping1);
		System.out.println("New combined list: " + groceries1);
		
		if(groceries1.contains("milk"))
			groceries1.remove("milk");
		System.out.println(groceries1);
		
	
		LinkedList<Integer> test = new LinkedList<>(Arrays.asList(1,2,3,4,5));
		LinkedList<String> test2 = new LinkedList<>(Arrays.asList("One","Two","Three"));
		
		
		test.add(1);
		test2.add("Four");
		test2.addAll(groceries1);
		
		System.out.println(test);
		System.out.println(test2);
		
		System.out.println("Size is: " + test.size());
		
		
		if(test.contains(3)) {
			System.out.println("Yes, list contains: " + 3);
		}
		if(test.contains(6)) {
			System.out.println("Yes, list contains: " + 6);
			}
		else {
			System.out.println("No, list does not contain: " + 6);
		}
	}
	

}
