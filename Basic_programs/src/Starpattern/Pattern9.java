package Starpattern;

public class Pattern9 {

	public static void main(String[] args) {
		
		

        for (int i = 1; i <=10; i++) {
            // Print increasing numbers
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k =1; k<=i; k++) {
                System.out.print(" *");
            }

            System.out.println(" ");
        }

		

	}

}
