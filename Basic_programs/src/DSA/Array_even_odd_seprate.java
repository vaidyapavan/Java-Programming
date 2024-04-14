package DSA;

class OddEvenSeparate {
    void oddEven() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr.length]; // New array to store the result
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        // Separate even and odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[evenIndex] = arr[i];
                evenIndex++;
            } else {
                result[oddIndex] = arr[i];
                oddIndex--;
            }
        }

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

public class Array_even_odd_seprate {
    public static void main(String[] args) {
        OddEvenSeparate obj = new OddEvenSeparate();
        obj.oddEven();
    }
}
