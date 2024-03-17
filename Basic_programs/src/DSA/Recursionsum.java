package DSA;

public class Recursionsum {
    static int sum = 0;

    public static int sum(int n) {
        if (n <= 0) {
            return sum;
        }
        sum= sum+ n;
        return sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = sum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + result);
    }
}
