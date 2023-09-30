package bai;

public class Bai3_De1 {
	public int[][] matrix;
    public int size;

    public Bai3_De1(int[][] matrix) {
        this.matrix = matrix;
        this.size = matrix.length;
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isSymmetric() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 8},
                {2, 5, 6},
                {3, 6, 9}
        };
        Bai3_De1 mat = new Bai3_De1(array);
        System.out.println("Ma tran vua nhap la:");
        mat.printMatrix();

        if (mat.isSymmetric()) {
            System.out.println("Ma tran doi xung qua duong cheo chinh");
        } else {
            System.out.println("Ma tran khong doi xung qua duong cheo chinh");
        }
    }

}
