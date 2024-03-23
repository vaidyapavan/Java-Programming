package DSA;
import java.util.*;

public class Laargest_number {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the Numbers: ");
		int a= s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("largest no is:"+" "+a);
		 }
		 else if(b>a && b>c) {
			 System.out.println("largest no is:"+" "+b);
			 
		 }
		 else if(c>a && c>b) {
			 System.out.println("largest no is:"+" "+c);
			 
		 }
		 else {
			 System.out.println("Numbers are equal");
		 }
	}

}
