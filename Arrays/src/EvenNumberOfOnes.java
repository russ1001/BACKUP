import java.util.*;

public class EvenNumberOfOnes {
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[2][2];
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
				
				matrix[i][j] = (int)(Math.random() *2);
				System.out.print(matrix[i][j]);
							
			}
			
			System.out.println();
			
			
		}
		
		if(hasEvenOnes(matrix)) {
			
			System.out.println("All rows and columns have even ones");
		}
		else {
			
			System.out.println("All rows and columns did not have even ones");
		}
	}

	
	public static boolean hasEvenOnes(int[][] matrix) {
		
		for(int i=0; i<matrix.length; i++) {
			
			int oneCount = 0;
			
			for(int j=0; j<matrix[i].length; j++) {
				
				if(matrix[i][j] == 1) {
					
					oneCount++;
				}
				
			}
			
			if(oneCount % 2 != 0 ) {
				
				return false;
			}
			
		}
		
		for(int j=0; j<matrix[0].length; j++) {
			
			int oneCount = 0;
			for(int i=0; i<matrix.length; i++) {
				
				if(matrix[i][j] == 1) {
					
					oneCount++;
				}
				
			}
			
			if(oneCount % 2 != 0) {
				
				return false;
				
			}
		}
		
		return true; 
	}
	
}
