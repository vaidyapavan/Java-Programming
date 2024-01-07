/*package clss;
import java.util.*;
class Perfect{
	 void perfectno(int no)
	 {
		  int count=0;
		  
		 for(int i=1;i<no;i++)
		 {
			if(no%i==0)
			{
				count=count+i;
			}
		 }
		 if(count==no)
		 {
			 System.out.println("no is perfect no:");
		 }
		 else
		 {
			 System.out.println("no is not perfect");
			 
		 }
		 
		 
		 
	 }
	
}

	class DSA{
	public static void main(String [] args) {
		Perfect obj=new Perfect();
		obj.perfectno(5);
		
	}
	
}*/

package java;
import java.util.*;
class Perfect{
	 void perfectno()
	 {
		  
		  int count1=0;
		 for(int i=1;i<50;i++)
		 {
			 int count=0;
			 for(int j=1;j<=i;j++)
			 {
				 if(i%j==0)
					{
					 count=count+i;
						count1=count1+1;
					}
			 }
					 
		     if(count==i)
		       {
			     System.out.println("no is perfect no:");
		      }
		     else
		       {
			      System.out.println("no is not perfect");
			 
		       }
			 }
		 }
	 }


	 
		 
			    		 
		
		 	 
			
				
	 public class Perfectnumber {
	public static void main(String[] args) {
		    	Perfect obj=new Perfect();
	}
	 }
		    


	
