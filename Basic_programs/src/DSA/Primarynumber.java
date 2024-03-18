package DSA;
import java.util.*;

public class Primarynumber {

	public static void main(String[] args) {
		
		int n=100;
		int totalprimeno =0;
		for(int i=1;i<=100;i++)
		{
			 int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			
			if(count==0)
			{
				totalprimeno++;
				
			}
			
		}
		System.out.println("total prime numbers are:"+totalprimeno);
		
		
		

	}

}
