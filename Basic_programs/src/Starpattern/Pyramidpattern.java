package Starpattern;

public class Pyramidpattern {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows for the pyramid

        for (int i = 0; i < rows; i++) {
            // Print spaces in decreasing order
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print stars in increasing order
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
