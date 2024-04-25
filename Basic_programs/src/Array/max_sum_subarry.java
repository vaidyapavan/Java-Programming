package Array;

class Subarray {
    int arr[] = {4, 5, -2, -1, -4, -5};
    int n = arr.length;

    void max_sum() {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sum of a subarray is: " + max);
    }
}

public class max_sum_subarry  {
    public static void main(String[] args) {
        Subarray obj = new Subarray();
        obj.max_sum();
    }
}
