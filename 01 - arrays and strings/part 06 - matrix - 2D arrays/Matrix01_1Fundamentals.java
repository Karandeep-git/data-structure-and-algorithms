
public class Matrix01_1Fundamentals {

    public static void main(String[] args) {

        // Method 1 - matrix declaration with sizes
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns, all zeros

        // Method 2 - matrix declaration with values
        int[][] matrix2 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int rows = matrix2.length;
        int cols = matrix2[0].length;

        System.out.println("Rows in the matrix: " + rows);
        System.out.println("Cols in the matrix: " + cols);

        System.out.println("Accesssing the element at row-1 and col-2: " + matrix2[1][2]);

        // Traversal - Row by Row

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
