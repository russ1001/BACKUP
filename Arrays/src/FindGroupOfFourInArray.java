import java.util.*;

public class FindGroupOfFourInArray {

	public static void main(String[] ags) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		
		int size = input.nextInt();
		if(size<0) {
			
			System.out.println("ERROR: value entered is a non-postive number");
			System.exit(0);
		}
		
		int[] values = new int[size];
		
		System.out.print("Enter the values: ");
		for(int i=0; i<values.length; i++) {
			
			values[i] = input.nextInt();
			
			
		}
		
		if(isConsecutiveFour(values))
			System.out.println("The series has consecutive fours");
		else
			System.out.println("The series has no consecutive fours");
		
	}
	
	
	public static boolean isConsecutiveFour(int[] values) {
		
		for(int i=0; i<values.length-3; i++) {
			
			boolean isEqual = true;
			
			for(int j=i; j<i+3; j++) {
				
				if(values[j] != values[j+1]) {
					
					isEqual = false;
					break;
				}
				
				
				}
			if(isEqual) {
				return true;
			}
				
		}
		return false;
		
	}
	
	
	
	
	
}
