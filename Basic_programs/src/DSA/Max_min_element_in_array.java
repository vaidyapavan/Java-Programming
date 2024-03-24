package DSA;

public class Max_min_element_in_array {

	public static void main(String[] args) {
		
		int arr[]= {2,67,8,9,34,90,12,67};
		
		int max= arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum element in array is:"+" "+max);
		System.out.println("Minimum element in array is:"+" "+min);
		
		

	}

}
