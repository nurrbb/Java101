public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3, 4}, {5, 6, 4}};

        System.out.println("Matrix:");
        printMatrix(matrix1);

        System.out.println("Transpose:");
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;

        int[][] transpose1 = new int[cols1][rows1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                transpose1[j][i] = matrix1[i][j];
            }
        }

        printMatrix(transpose1);
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matrix:");
        printMatrix(matrix2);

        System.out.println("Transpose:");
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        int[][] transpose2 = new int[cols2][rows2];

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                transpose2[j][i] = matrix2[i][j];
            }
        }

        printMatrix(transpose2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}