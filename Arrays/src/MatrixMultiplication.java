import java.util.*;



public class MatrixMultiplication {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		final int N = 3;
		
		System.out.println("Enter matrix1: ");
		double [][] matrix1 = new double[N][N];
		for(int i=0; i<matrix1.length; i++) {
			
			for(int j=0; j<matrix1[i].length; j++) {
				
				matrix1[i][j] = input.nextDouble();
				
			}
			
		}
		
		
		System.out.println("Enter matrix2: ");
		double [][] matrix2 = new double[N][N];
		for(int i=0; i<matrix2.length; i++) {
			
			for(int j=0; j<matrix2[i].length; j++) {
				
				matrix2[i][j] = input.nextDouble();
				
			}
			
		}
		
		double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
		System.out.println("\nThe multiplication of the matrices is ");
		printResult(matrix1, matrix2, resultMatrix, "*");
		
		
	}
	
	
	
	
	
	public static double [][] multiplyMatrix(double[][] m1, double[][] m2){
		
		double[][] result = new double[m1.length][m2[0].length];
		
		for(int i=0; i<m1.length; i++) {
			
			for(int j=0; j<result.length; j++) {
				
				for(int k=0; k<result[0].length; k++) {
					
					result[i][j] += m1[i][k] * m2[k][j];
					
				}
				
			}
			
		}
		
		return result;
		
	}
	
	
	public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op) {
		
		for(int i=0; i<m1.length; i++) {
			
			for(int j=0; j<m1[0].length; j++) {
				
				System.out.print(" " + m1[i][j]);
				
				if(i == m1.length/2)
					System.out.print("  " + op + "  ");

				else 
					System.out.print("     ");
				
				for(int j=0; j<m2[0].length; j++) {
					
					System.out.print(" " + m2[i][j]);
				
					
					if(i == m1.length/2)
						System.out.print(" = ");

					else 
						System.out.print("     ");
					
					for(int j=0; j<m3[0].length; j++) {
						
						System.out.print(" " + m3[i][j]);
					
					System.out.println();
				
			}
			
		}
		
	}
	
	
	
	
}
