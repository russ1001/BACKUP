import java.util.*;
import java.util.concurrent.CountDownLatch;

public class ComputeFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();
		input.close();		
		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
		System.out.println("The # of times the fib() method is called is " + count);
		
	}
	
	static int count = 0;
	public static long fib(long index) {
		if(index==0) {
			count++;
			return 0;
			
		}
		else if(index==1) {
			count++;
			return 1;
			
		}
		else {
			count++;
			return fib(index-1) + fib(index-2);
			
		}
	}
	
	
	
	
}
