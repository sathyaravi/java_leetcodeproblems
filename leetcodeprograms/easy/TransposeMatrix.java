package leetcodeprograms.easy;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		TransposeMatrix obj = new TransposeMatrix();
	    int[][] result = obj.transposeMatrix(matrix);

	        System.out.println(Arrays.deepToString(result));

		
	}
	public int[][] transposeMatrix(int[][] matrix){
		
		
		  int m = matrix.length;
		  int n=matrix[0].length;
		  int[][] transposeMatrix = new int[n][m];

	        for(int i=0;i<matrix.length;i++){

	            for(int j=0;j<matrix[i].length;j++){

	                transposeMatrix[j][i]=matrix[i][j];
	            }
	        }

	        return transposeMatrix;
		
		
	}
}
