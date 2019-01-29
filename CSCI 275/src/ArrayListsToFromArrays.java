import java.util.*;

public class ArrayListsToFromArrays {

	public static void main(String[] args) {
		
		// create an array
		String[] array = {"red", "green", "blue"};
		
		// create an ArrayList from an array of objects
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		
		// create an array of objects from an ArrayList
		String[] array1 = new String[list.size()];
		list.toArray(array1);
		
		// max and min in an ArrayList
		String[] array2 = {"red", "green", "blue"};
		System.out.println(java.util.Collections.max(new ArrayList<String>(Arrays.asList(array2))));
		System.out.println(java.util.Collections.min(new ArrayList<String>(Arrays.asList(array2))));
		
		// shuffling an ArrayList
		Integer[] array3 = {3,5,95,4,15,34,3,6,5};
		ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(array3));
		java.util.Collections.shuffle(list);
		System.out.println(list2);
		
		
	}
	
	
	
	
	
}
