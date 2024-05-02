package Array;



class duplicate_element
{
	int arr[]= {3,67,8,12,4,67,23,5,4,3};
	int n= arr.length-1;
	void check()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(" element is: "+arr[i]);
				}
			}
		}
		
	}
}
public class Duplicate_element_in_array {

	public static void main(String[] args) {
		duplicate_element obj = new duplicate_element();
		obj.check();
		
		

	}

}
