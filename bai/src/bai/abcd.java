package bai;

public class abcd {
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + "  ");

			}
			System.out.println();
		}
	}

	public static int[][] createPascalTriangle(int[] array) {
		if (array.length < 0 || array == null)
			return null;
		int[][] result = new int[array.length][array.length];
		for (int row = 0; row < result.length; row++) {
			for (int col = result[row].length ; col < result[row].length; col++) {
				result[row] = new int[row + 1];
				result[col] = new int[col + 1];
				result[row][row] = array[row];
				
			}

		}

		return result;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 7 }, { 9, 5, 2 } };
		printMatrix(createPascalTriangle(new int[] { 1, 2, 6, 5 }));

	}
}
