package Basic_java;
import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the number of an array:");
        n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int sum = sum(arr); // Call the sum method with the array as argument
        System.out.println("Sum of the array elements is: " + sum);
    }

    // Define the sum method outside of the main method
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
