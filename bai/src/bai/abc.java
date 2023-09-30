package bai;

public class abc {
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row--) {
			for (int col = 0; col < matrix[row].length; col--) {
				System.out.print(matrix[row][col] + "   ");

			}
			System.out.println();
		}

	}

	public static int[][] cPascal(int[] array) {
		int [][] result = new int [array.length][];
		for (int row = 0; row < result.length; row++) {
			result[row] = new int[row + 1];
			result[row][row] = array[row];
			
			for (int col = 0;col < result.length; col++ ) {
			}
		}

		return result;
	}

	
	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static void main(String[] args) {
		//printMatrix(new int[][] { { 0, 1, 2 }, { 3, 2, 4 }, { 7, 9, 8 } });
		int [] array = {1,2,3};
		printMatrix(cPascal(array));
	
	}

}
