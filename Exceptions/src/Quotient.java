import java.util.Scanner;

// quotient class that calculates the quotient of two integers
public class Quotient {

	public static int quotient(int n1, int n2) {
		// check for the exception here
		if(n2 == 0) 
			throw new ArithmeticException("Divisor cannot be zero");
		return(n1/n2);
	}

	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
		
		// try block that calls the method quotient 
		// and prints result
		try {			
			int result = quotient(n1,n2);
			System.out.println(n1 + "/" + n2 + "=" + result);	
		}
		
		catch(Exception ex) {
			System.out.println("Exception: an integer cannot be divided zero");
		}
		System.out.println("Program continues to execute...");
	}
}
