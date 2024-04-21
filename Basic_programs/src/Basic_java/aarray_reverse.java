package Basic_java;

class array1 {
    int arr[] = {6, 90, 23, 54, 7, 9, 34, 12, 43, 6, 54, 67, 9};
    int n = arr.length; 
    void reverse() {
        int j = n - 1; 
        for (int i = 0; i < n / 2; i++, j--)
        { 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    void show() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class aarray_reverse {
    public static void main(String[] args) {
        array1 obj = new array1();
        obj.reverse();
        obj.show();
    }
}
