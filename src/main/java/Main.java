import java.util.*;

public class Main {
    int[][] matrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
    int[][] matrix2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    int[][] matrix3 = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25} };

    int[][] rotate(int[][] matrix) {
        int dim = matrix.length;
        int limit;
        if (dim % 2 == 0) {
            limit = dim / 2;
        } else {
            limit = (dim / 2) + 1;
        }

        for (int i = 0; i < limit; i++) {
            for (int j = i; j < dim - i - 1; j++) {
                int n = matrix[i][j];
                int e = matrix[j][dim-i-1];
                int s = matrix[dim-i-1][dim-j-1];
                int o = matrix[dim-j-1][i];
                matrix[i][j] = o;
                matrix[j][dim-i-1] = n;
                matrix[dim-i-1][dim-j-1] = e;
                matrix[dim-j-1][i] = s;
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Main program = new Main();
        printMatrix(program.matrix2);
        int[][] result = program.rotate(program.matrix2);
        printMatrix(result);
    }
}
