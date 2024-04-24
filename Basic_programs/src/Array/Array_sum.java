package Array;

class array2 {
    int arr[] = {5, 7, 12, 8, 5, 6, 23, 6, 4, 12};
    int n = arr.length;

    void array_sum() {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    sum += arr[j];
                }
            }
            arr[i] = sum;
        }

        System.out.println("Final array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Array_sum {
    public static void main(String[] args) {
        array2 obj = new array2();
        obj.array_sum();
    }
}
