package DSA;
import java.util.*;


  class check_oddeven
{
	void odd_evennumber()
	{
		int no;
		System.out.println("enter the  number");
		Scanner s=new Scanner(System.in);
		 no= s.nextInt();
		
		 
			 if(no%2==0)
			 {
				 System.out.println("no is even");
				 
			 }
			 else {
				 System.out.println("no is odd");	 
				 
			 }	
	}
	
}
public class odd_even {

	public static void main(Stringexample[] args) {
		check_oddeven obj= new check_oddeven();
		obj.odd_evennumber();
		

	}

}
