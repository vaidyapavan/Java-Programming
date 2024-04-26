
package java;
class odd_even1 {
    void check() {
        int n = 9;
        if (n % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}

public class odd_even {
    public static void main(String[] args) {
        odd_even1 obj = new odd_even1();
        obj.check();
    }
}
