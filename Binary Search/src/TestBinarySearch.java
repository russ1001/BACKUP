
public class TestBinarySearch {

	public static void main(String[] args) {
		int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
		
		int i = RecursiveBinarySearch.recursiveBinarySearch(list, 2);
		System.out.println(i);
		
		int j = RecursiveBinarySearch.recursiveBinarySearch(list, 11);
		System.out.println(j);
		int k = RecursiveBinarySearch.recursiveBinarySearch(list, 12);
		System.out.println(k);
		int l = RecursiveBinarySearch.recursiveBinarySearch(list, 1);
		System.out.println(l);
		int m = RecursiveBinarySearch.recursiveBinarySearch(list, 3);
		System.out.println(m);
		
	}
	
}
