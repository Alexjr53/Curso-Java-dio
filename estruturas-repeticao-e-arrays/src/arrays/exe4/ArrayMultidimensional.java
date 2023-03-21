package arrays.exe4;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(9);
                
            }
        }

        for (int[] linha : matrix) {
            for (int coluna : linha) {
                System.out.print(coluna);
            }
            System.out.println();
        }
    }
}
