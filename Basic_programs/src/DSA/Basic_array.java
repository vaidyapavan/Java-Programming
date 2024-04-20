package DSA;


class exampple
{
	void array_example(int arr[])
	{
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
	}
	int max(int arr[])
	{
		int max_element=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max_element)
			{
				max_element=arr[i];
			}
			
		}
		return max_element;
		
	}
}


public class Basic_array {

	public static void main(String[] args) {
	
		
		int arr[]= {5,89,5,6,7,3,4,1,23,78};
		
		exampple obj= new exampple();
		obj.array_example(arr);
		int max=obj.max(arr);
		System.out.println("Maximum element is: "+max);
		
		

	}

}
