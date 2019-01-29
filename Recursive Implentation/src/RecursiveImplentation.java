
public class RecursiveImplentation {

	/** Use binary search to find the key in the list */
	public static int recursiveBinarySearch(int[] list, int key) {
	  int low = 0;
	  int high = list.length - 1;
	  return recursiveBinarySearch(list, key, low, high);
	}
	
	/** Use binary search to find the key in the list between
	    list[low] list[high] */
	public static int recursiveBinarySearch(int[] list, int key,
	  int low, int high) {
	  if (low > high)  // The list has been exhausted without a match
	    return -low - 1;
	
	  int mid = (low + high) / 2;
	  if (key < list[mid])
	    return recursiveBinarySearch(list, key, low, mid - 1);
	  else if (key == list[mid])
	    return mid;
	  else
	    return recursiveBinarySearch(list, key, mid + 1, high);
	}

}
