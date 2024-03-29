package DSA;

public class Matrix_addition {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 6, 7},
            {8, 9, 3}
        };
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 6, 7},
            {8, 9, 3}
        };

        int[][] addition = new int[3][3];

        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result of matrix addition
        System.out.println("Addition of the matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }
    }
}
