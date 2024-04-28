package Array;

class LeadersElement {
    int arr[] = {2, 3, 5, 4, 1, 9, 5, 2};
    int n = arr.length;

    void check() {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <= arr[i]) { // Check if element to the right is less than or equal to current element
                    count++;
                }
            }
            if (count == n - i - 1) { // Check if count equals the number of remaining elements to the right
                System.out.println("Leader element is: " + arr[i]);
            }
        }
    }
}

public class Leaders_of_array {
    public static void main(String[] args) {
        LeadersElement obj = new LeadersElement();
        obj.check();
    }
}
