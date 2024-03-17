package DSA;

public class Recursionfactorial {
    
    public static int factorial(int n) {
        int fact = 1;
        if (n == 0) {
            return 1;
        }
        fact = n * factorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
