package DSA;


class square
{
	void square_of_element( )
	{
		int arr[] = {-20, -5,-4, 5, 6, 7, 10, 9};
		
		int n= arr.length-1;
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]*arr[i];
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Square of an array element in increasing order is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		 
	}
}
public class Array_element_square {

	public static void main(String[] args) {
		square obj= new square();
		obj.square_of_element();
		

	}

}
