package Array;

class array {
    int arr1[] = {2, 9, 6, 8, 4, 7};
    int arr2[] = {23, 78, 1, 23, 5, 4};
    int m = arr1.length;
    int n = arr2.length;
    int s = m + n;
    int arr3[] = new int[s];

    void concat() {
        int count = 0;

        for (int i = 0; i < m; i++) {
            arr3[i] = arr1[i];
            count++;
        }

        for (int j = 0; j < n; j++) {
            arr3[count] = arr2[j];
            count++;
        }

        System.out.println("Concatenated array is: ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println(" ");

    }
    void sorting()
    {
    	for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - i - 1; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < s; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println(" ");
    	
    }
    void median()
    {
    	int mid = s / 2;
        if (s % 2 == 0) { // If array length is even
            double median = (arr3[mid - 1] + arr3[mid]) / 2.0;
            System.out.println("Median of the array is: " + median);
        } else { // If array length is odd
            System.out.println("Median of the array is: " + arr3[mid]);
        }
    }
}
public class Median_of_two_array {

	public static void main(String[] args) {
		array obj= new array();
		obj.concat();
		obj.sorting();
		obj.median();
		

	}

}
