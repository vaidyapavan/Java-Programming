package DSA;

class SecondMax {
    int arr[] = {1, 4, 6, 8, 9, 12, 8, 1, 4, 6, 9};
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    void findLargestElement() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);
    }

    void findSecondLargest() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element is: " + secondMax);
        }
    }
}

public class Second_largest_in_array {
    public static void main(String[] args) {
        SecondMax obj = new SecondMax();
        obj.findLargestElement();
        obj.findSecondLargest();
    }
}
