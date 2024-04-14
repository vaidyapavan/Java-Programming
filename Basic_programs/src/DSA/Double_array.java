
package DSA;
import java.util.Scanner;

class MultidimensionalArray {
    int m, n;
    int arr[][];

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        m = s.nextInt();
        System.out.println("Enter the number of columns:");
        n = s.nextInt();
        arr = new int[m][n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
    }

    void show() {
        System.out.println("The array elements are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}

public class Double_array  {
    public static void main(String[] args) {
        MultidimensionalArray array = new MultidimensionalArray();
        array.input();
        array.show();
    }
}
