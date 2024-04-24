
package Basic_java;

class selection_sort {
    int arr[] = {56, 9, 12, 1000, 2, 6, 5, 22, 43};
    int n = arr.length;

    void selection() {
        for (int i = 0; i < n - 1; i++) {
            int min = i; 
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
         
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    void show() {
        System.out.println("array after sorting is:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Selection_sort {
    public static void main(String[] args) {
        selection_sort obj = new selection_sort();
        obj.selection();
        obj.show();
    }
}
