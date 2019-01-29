import java.util.*;

public class ParseBinaryNumAsStringToDecimalInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		String binary = input.next();
		System.out.println("The binary number " + binary + " is equal to "+ bin2Dec(binary) + " in decimal format");
		input.close();
		
	}
	
	public static int bin2Dec(String binaryString) {
		
		int str = (binaryString.charAt(0) == '1') ? 1:0;
		if(binaryString.length() == 1) {
			return str;
		}
		return(int) (Math.pow(2, binaryString.length() - 1) * str + bin2Dec(binaryString.substring(1)));	
	}
	
} 
