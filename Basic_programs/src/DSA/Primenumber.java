package DSA;
import java.util.*;

public class Primenumber {

	public static void main(String[] args) {
		 int n;
			System.out.println("Enter the number:");
		 Scanner s= new Scanner(System.in);
		  n= s.nextInt();
		  int count=0;
		    for(int i=2;i<n;i++)
		    {
		    	if(n%i==0)
		    	{
		    		count++;
		    	}
		    	if(count>0)
		    	{
		    		break;
		    	}
		    }
		    if(count>0)
		    {
		    	System.out.println( n+" " +" is not prime number");
		    	
		    }
		    else{
		    	System.out.println( n +" "+ "is  prime number");
		    	
		    }
		    
		
	}

}
