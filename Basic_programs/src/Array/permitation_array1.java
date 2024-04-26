package Array;




class subarray {
    int arr[] = {7, 9, 8};
    int n = arr.length;

    void calculate() {
        int no_of_subarray = ((n) * (n + 1)) / 2;
        System.out.println("Number of subarrays is: " + no_of_subarray);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Print the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

public class permitation_array1 {
    public static void main(String[] args) {
    	 subarray  obj = new  subarray ();
        obj.calculate();
    }
}
