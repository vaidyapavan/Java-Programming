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
        
       String substring=fname.substring(2);
       System.out.println(substring);
        
        
        for(int i=0;i<fname.length();i++)
        {
        	System.out.println(fname.charAt(i));
        }
        
        String name1="pavan";
        String name2="pavan";
        if(name1.compareTo(name2)==0)
        {
        	System.out.println("Strings are equal");
        	
        }
        else {
        	System.out.println("Strings are not equal");
        	
        }

        s.close(); // Close the Scanner to prevent resource leak
    }
}
