package Basic_java;
import java.util.*;

class prime {
    void check() {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = s.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Optimized loop condition
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Number is not prime");
        } else {
            System.out.println("Number is prime");
        }
    }
}

public class Prime_number {
    public static void main(String[] args) {
        prime obj = new prime();
        obj.check();
    }
}
