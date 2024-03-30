package Starpattern;

public class Pattern8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }

            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(" " + k);
            }

            System.out.println(" ");
        }

    }

}
