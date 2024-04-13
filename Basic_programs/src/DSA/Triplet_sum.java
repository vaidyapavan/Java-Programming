package DSA;

class Sum {
    void sumOfTriplet() {
        int arr[] = {1, 4, 6, 8, 96, 7, 8, 90, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7};
        
        int targetSum = 14;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Total number of triplets whose sum is " + targetSum + " are " + count);
    }
}

public class Triplet_sum {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sumOfTriplet();
    }
}
