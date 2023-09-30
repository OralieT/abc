package bai;

public class mang2 {
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
		int[][] result = new int[array.length][];
		for (int row = 0; row < array.length - 1; row++) {
			result[row] = new int[row + 1];

			for (int col = 0; col < result[row].length; col++) {
				result[row][col] = col + 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// printMatrix(new int[][] { { 1, 2, 3 }, { 4, 3, 5 } });
		int [] arr = {1,2,3,5,6};
		printMatrix(createPascalTriangle(arr));
	}
}
