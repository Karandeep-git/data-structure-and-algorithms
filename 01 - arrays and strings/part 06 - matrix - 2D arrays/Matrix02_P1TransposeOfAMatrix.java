


public class Matrix02_P1TransposeOfAMatrix {

    public static void transposeSquare(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] transposeAny(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        transposeSquare(matrix);
        System.out.println("Transpose of a Square Matrix: ");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] transposed = transposeAny(matrix2);
        System.out.println("Transpose of a Non-square Matrix: ");
        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

}
