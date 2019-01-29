
public class OutofMemErrorClass {

	public static void main(String[] args) {
		
		try {
			double[] array = new double[1000000000];
			array = new double[array.length * 100000000];
		}
		catch (OutOfMemoryError ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
