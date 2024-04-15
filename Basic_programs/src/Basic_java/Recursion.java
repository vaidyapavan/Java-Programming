package Basic_java;

class BasicRecursion {
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}

public class Recursion {
    public static void main(String[] args) {
        BasicRecursion obj = new BasicRecursion();
        int fact1 = obj.fact(5);
        System.out.println(fact1);
    }
}
