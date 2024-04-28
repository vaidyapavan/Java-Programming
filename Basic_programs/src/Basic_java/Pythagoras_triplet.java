package Basic_java;

class Pythagoras {
    int arr[] = {2, 3, 5, 4, 1, 9, 5, 2};
    int n = arr.length;

    void check() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] * arr[k] == arr[i] * arr[i] + arr[j] * arr[j]) {
                        System.out.println("Pythagorean triplet is: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
    }
}

public class Pythagoras_triplet  {
    public static void main(String[] args) {
        Pythagoras obj = new Pythagoras();
        obj.check();
    }
}
