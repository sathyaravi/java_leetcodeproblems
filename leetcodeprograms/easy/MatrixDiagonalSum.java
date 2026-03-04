package leetcodeprograms.easy;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		
		int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
		
		int n = matrix.length;
		
		int diagonal_Sum = 0;
		
		for(int i=0;i<n;i++) {
			
			diagonal_Sum+=matrix[i][i];//to add primary diagonal elements
			
			diagonal_Sum+=matrix[i][matrix.length-1-i];//to add secondary elements
			
				
		}
		//to check if any element is added twice in the diagonal sum. If yes, then subtract it from the original sum
		if(n%2==1) {
			
			diagonal_Sum -= matrix[n/2][n/2];
			
		}
		
		
		System.out.println("Diagonal Sum of the matrix:"+diagonal_Sum);
	}

}
