package DSA;

import java.util.Scanner;
class occurance
{
	void occurance_measure()
	{
		int[] arr= {12,89,56,3,4,7,9,76,89,45,9,45,67,89,9};
		Scanner s =new Scanner(System.in);
		int n;
		System.out.println("enter the number that you wane to find the last occurance:");
		
		n=s.nextInt();
		
		int count=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				count=i;
			}
		}
		System.out.println("last occurance of "+n+ " is:"+count);
	}
	
}

public class Last_occurance_of_element_in_array {

	public static void main(String[] args) {
		occurance obj=new occurance();
		obj.occurance_measure();
		
		

	}

}
