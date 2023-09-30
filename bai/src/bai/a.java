package bai;

import java.util.Random;

public class a {
	public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[][] matrix = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        //in ma tran
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau khi in hết một dòng
        }

        //Tinh tong tung dong ma tran
        int[] rowSum = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += matrix[i][j];
            }
        }
        //Tim dong co tong lon nhat
        int max = 0;
        for (int i = 0; i < m; i++) {
            if (rowSum[i] > rowSum[max]) {
                max = i;
            }
        }
        // In ma trận và tổng từng dòng ra màn hình
        System.out.println("Ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" -> Tổng dòng " + i + " = " + rowSum[i]);
        }
        System.out.println("Dòng có tổng số lớn nhất là dòng " + max + " với tổng số là " + rowSum[max]);

    }
}


