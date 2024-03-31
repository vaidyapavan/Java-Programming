package DSA;

public class Recursion {

    public static void main(String[] args) {

        int no = 5;

        int factorial = fact(no);
        System.out.println("Factorial is: " + factorial);
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * fact(n - 1); // Recursive call to calculate factorial
    }
}
