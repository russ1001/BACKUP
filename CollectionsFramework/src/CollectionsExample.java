import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionsExample {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,1,2,3,5,8,13,1,1,1,1,21,34,55);
		List<Integer> list2 = Arrays.asList(12,14,22,35,56,4,9,12,99);
		List<Integer> list3 = Arrays.asList(21,22,23,24,24,25,26,27,28,29);
		System.out.println("The position of #21: " + Collections.binarySearch(list1, 21));
		System.out.println(list2);
		System.out.println(list3);
		
		Collections.sort(list1);
		System.out.println();
		System.out.println(list1);		
		
		
		System.out.println();
		for(int i=0; i<4; i++) {
		Collections.shuffle(list1);
		System.out.println(list1);
		}
				
		Collections.sort(list1);
		System.out.println();
		System.out.println(list1);
		
		System.out.println();
		System.out.println(Collections.disjoint(list1, list2));
		
		System.out.println();
		System.out.println(Collections.frequency(list1, 1));
		
		System.out.println();
		System.out.println(Collections.frequency(list2, 12));
		
		System.out.println();
		System.out.println(Collections.frequency(list3, 24));
		
		
		
		
	}
	
}
