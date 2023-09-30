package Basic;

import java.util.Iterator;

public class a {
	public int[][] matrix;
	public int size;

	public a(int[][] matrix) {
		this.matrix = matrix;
		this.size = matrix.length;
	}

	public void printmatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	public boolean isSymmetric() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int [][] array = { {1,2,2}, {2,5,7}, {2,7,9} };
		a mat = new a(array);
		System.out.println("Ma tran vua nhap lai:");
		mat.printmatrix();
		
		if (mat.isSymmetric()) {
			System.out.println("Ma tran doi xung qua duong cheo chinh");
		}
		else {
			System.out.println("Ma tran khong doi xung qua duong cheo chinh");
		}

	}
}
