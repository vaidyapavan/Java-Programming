package DSA;

public class Max_element_in_array {

	public static void main(String[] args) {
		
		
		int[] arr= {12,89,56,3,4,7,9,76,89,45};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("maximum elemen in the array is:"+ max);

	}

}
