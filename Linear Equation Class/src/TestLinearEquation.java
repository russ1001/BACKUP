import java.util.*;


public class TestLinearEquation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter six double values: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble(); 
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		input.close();
		
		LinearEquation line = new LinearEquation(a,b,c,d,e,f);
		
		if(line.isSolvable()) {
			System.out.println("\nx is equal to " + line.getX() + " and y is equal to " + line.getY());
		}
		else {
			System.out.println("The equation has no solution");
		}
		
		
	}
	
	
}
