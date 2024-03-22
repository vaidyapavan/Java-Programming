package DSA;
import java.util.*;

public class Stringconcat {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		
		System.out.println("Enetr the string1:");
		 String st=s.nextLine();
		 System.out.println("Enetr the string2:");
		 String st1=s.nextLine();
		 
//		 String st2= st.concat(st1);
		 String st2=st+""+st1;
		 
		 
		 System.out.println("Concated String is "+  st2);
		 
		 
		
		

	}

}
