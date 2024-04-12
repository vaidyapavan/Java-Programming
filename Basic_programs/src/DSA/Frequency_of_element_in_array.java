package DSA;
import java.util.*;


class count_number
{
	void frequency()
	{
		int[] arr= {12,89,56,3,4,7,9,76,89,45};
		Scanner s =new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number that you want to count the frequency");
		n= s.nextInt();
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				count++;
			}
			
		}
		System.out.println(n+" number cooures "+ count+" times");
		
	}
}
public class Frequency_of_element_in_array {

	public static void main(String[] args) {
		count_number obj= new count_number();
		obj.frequency();
		

	}

}
