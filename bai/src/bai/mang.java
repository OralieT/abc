package bai;

public class mang {
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + "  ");
			}
			System.out.println();
		}
	}

	public static int[][] aPascal(int size) {
		if (size < 0)
			return null;

		int[][] result = new int[size][];
		for (int row = 0; row < size - 1; row++) {
			result[row] = new int[row + 1];

			for (int col = 0; col < result[row].length; col++) {
				result[row][col] = col + 1;
			}
		}
		return result;
	}

	public static int[][] createPascalTriangle(int[] array) {
		if (array.length < 0 || array == null)
			return null;
		int[][] result = new int[array.length][];
		for (int row = 0; row < result.length; row++) {
			result[row] = new int[row + 1];
			result[row][row] = array[row];
			
			for (int col = result[row].length - 1 - 1; col >= 0; col-- ) {
				result[row][col] = result[row][col + 1] - 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// int [][] matrix = {{0,0}, {0,0}};
		// printMatrix(matrix);
		//printMatrix(aPascal(5));
		int[] arr = { 1, 3, 6, 10, 15}; 
		printMatrix(createPascalTriangle(arr));
	}
}
