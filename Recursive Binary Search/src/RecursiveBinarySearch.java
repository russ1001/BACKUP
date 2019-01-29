/*Case 1: If the key is less than the middle element, recursively search the key in the first half of the array.
Case 2: If the key is equal to the middle element, the search ends with a match.
Case 3: If the key is greater than the middle element, recursively search the key in the second half of the array.
*/



// Use binary search to find the key in the list

public class RecursiveBinarySearch {
  public static int recursiveBinarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    return recursiveBinarySearch(list, key, low, high);
  } 

  private static int recursiveBinarySearch(int[] list, int key,
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
  
  public static void main(String[] args) {
    int[] list = {3, 5, 7, 8, 12, 17, 24, 29, 31};
    System.out.println(recursiveBinarySearch(list, 7));
    System.out.println(recursiveBinarySearch(list, 0));
    System.out.println(recursiveBinarySearch(list, 31));
  }
} 