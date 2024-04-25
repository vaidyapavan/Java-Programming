package Array;

class Product {
    int arr[] = {5, 1, 5, 2, 3, 4};
    int n = arr.length;

    void array_product() {
        long[] result = new long[n]; // Use long datatype for products

        // Calculate the products of all elements except the current one
        for (int i = 0; i < n; i++) {
            long mul = 1; // Use long datatype for product calculation
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    mul *= arr[j];
                }
            }
            result[i] = mul;
        }

        // Copy the products back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = (int) result[i]; // Cast long to int for the original array
        }

        System.out.println("Final array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class product_of_array  {
    public static void main(String[] args) {
        Product obj = new Product();
        obj.array_product();
    }
}
