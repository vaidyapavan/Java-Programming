package DSA;

class Major {
    int arr[] = {10, 20, 50, 30, 40, 50, 50, 50};
    int n = arr.length;

    void majorElement() {
        for (int i = 0; i < n; i++) {
            int count = 0;
            int majorElement = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == majorElement) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println("Major element is: " + arr[i]);
            }
        }
    }
}

public class Major_element_in_array {

    public static void main(String[] args) {
        Major obj = new Major();
        obj.majorElement();
    }
}
