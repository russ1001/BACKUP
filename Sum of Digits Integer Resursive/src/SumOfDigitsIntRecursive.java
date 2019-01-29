import java.util.*;

public class SumOfDigitsIntRecursive {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to add the digits: ");
		int digits = input.nextInt();
		input.close();
		
		System.out.println("The sum of the digits of " + digits + " is " + sumDigits(digits));
	}
	
	public static long sumDigits(long x) {
		
		if(x == 0)
			return x;
		else {
			return (x % 10) + sumDigits(x / 10);
		}
			
	}

}
