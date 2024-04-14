package DSA;










class prefix_Sum
{
	void sum_of_prefix_element()
	{
		  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		  
		  int n= arr.length-1;
		  System.out.println("original element are:");
		  for(int i=0;i<n;i++)
		  {
			  System.out.print( arr[i]+" ");
		  }
		  System.out.println(" ");
		  
		  
		  int sum=0;
		  for(int i=0;i<n;i++)
		  {
			  
				  sum=sum+arr[i];
				  arr[i]=sum;  
		  }
		  System.out.println("Prefix sum of an element is:");
		  
		  
		 
		  for(int i=0;i<n;i++)
		  {
			  System.out.print( arr[i]+" ");
		  }
	}
}
public class Prefix_sum_of_array {

	public static void main(String[] args) {
		prefix_Sum obj= new prefix_Sum();
		obj.sum_of_prefix_element();
		

	}

}


