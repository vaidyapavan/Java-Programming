import java.util.Scanner;

class Factorialno {
    void factno() {
        int no;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        no = s.nextInt();

        int fact = 1;
        for (int i = no; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial is: " + fact);
        s.close();  // Close the scanner to avoid resource leakage
    }
}

public class Factorial {
    public static void main(String args[]) {
        Factorialno s = new Factorialno();
        s.factno();
    }
}
