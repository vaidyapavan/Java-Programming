package DSA;

public class Reverse {

    public static void main(String[] args) {
        String str = new String("Pavan");

        int len = str.length();
        char[] strarray = str.toCharArray(); // Convert the string to a char array

        System.out.println(len);
        int j = len - 1; // Start from the end of the string
        for (int i = 0; i < j; i++, j--) { // Increment i and decrement j
            // Swap characters at i and j indices
            char temp = strarray[i];
            strarray[i] = strarray[j];
            strarray[j] = temp;
        }

        // Convert the char array back to string
        String reversedStr = new String(strarray);
        System.out.println("Reverse string is: " + reversedStr);
    }
}
