import java.util.*;

public class DecToHexAsStringRecursive {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a decimal # to be converted to hex: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		System.out.println("The number " + num + " in hex format is " + dec2Hex(num));
		
		
	}
	
	/** Method converts a decimal number 
	  * into a hex number as string */
	public static String dec2Hex(int value) {
		String result = "";
		return dec2Hex(value, result);
	}

	/** Recursive helper method */
	public static String dec2Hex(int value, String result) {
		int r = value % 16; // Remainder
		String remainder = r >= 10 ? 
			String.valueOf((char)('A' + r % 10)) : String.valueOf(r);
			
		if (value / 16 == 0) // Base case
			return remainder + result;
		else
			return dec2Hex(value / 16, remainder + result); // Recursive call
	}
}
