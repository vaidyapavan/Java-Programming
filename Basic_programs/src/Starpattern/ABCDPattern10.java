package Starpattern;

public class ABCDPattern10 {

	public static void main(String[] args) {
int asciiValue = 65;
        
        
        for (int i = 1; i <= 4; i++) {
            // Print characters
            for (int j = 1; j <= i; j++) {
                char ch = (char) asciiValue;
                System.out.print(" " + ch);
                asciiValue++;
                
            }
            System.out.println(" ");
            asciiValue++;
        }

	}

}
