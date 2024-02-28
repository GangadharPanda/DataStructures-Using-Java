package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*L
 * 
 * Given a matrix, if any of the cells in the matrix is 0, set all the elements in its row and column to 0.

	Examples
	1 1 1        1 0 1
	1 0 1   =>   0 0 0
	1 1 1        1 0 1
	
	0 1 2        0 0 0
	3 4 5   =>   0 4 5
	1 2 3        0 2 3
	
	0 1 0        0 0 0
	3 4 5   =>   0 4 0
	1 2 3        0 2 0
	
	0 1 0        0 0 0
	3 0 5   =>   0 0 0
	1 2 3        0 0 0

 */
public class RowColumnZero {

	static void setRowColumnZeroes(int[][] matrix) {

		Set<Integer> rowsTobeZero = new HashSet<>();
		Set<Integer> colsTobeZero = new HashSet<>();

		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[0].length; cols++) {
				if (matrix[rows][cols] == 0) {
					rowsTobeZero.add(rows);
					colsTobeZero.add(cols);
				}
			}
		}

		for (int row = 0; row < matrix.length; row++) {
			if (rowsTobeZero.contains(row)) {
				for (int col = 0; col < matrix[0].length; col++) {
					matrix[row][col] = 0;
				}
			}
		}

		for (int col = 0; col < matrix[0].length; col++) {
			if (colsTobeZero.contains(col)) {
				for (int row = 0; row < matrix.length; row++) {
					matrix[row][col] = 0;  
				}
			}
		}
		
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] +" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 1 }, { 1, 0 }, { 1, 1 } };
		setRowColumnZeroes(arr);
	}
}
