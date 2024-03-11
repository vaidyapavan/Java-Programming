package first_program;

import java.util.*;

public class Stringexample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fname;
        String lname;
        System.out.println("Enter your first name:");
        fname = s.nextLine();
        System.out.println("Enter your last name:");
        lname = s.nextLine();

        System.out.println("Your full name is:");
        System.out.println(fname + " " + lname);

        s.close(); // Close the Scanner to prevent resource leak
    }
}
