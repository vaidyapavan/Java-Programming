package DSA;


class array_totation
{
	void rotate_by_k()
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int k=2;
		int n= arr.length-1;
		k=k%n;
		int j=0;
		for(int i=n-k;i<=n-1;i++)
		{
			arr[0]=arr[i];
			j++;
			
		}
		for(int i=0;i<n-k;i++)
		{
			arr[j]=arr[i];
		}
		
		
		System.out.println("Array element after rotating are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}
}
public class Array_rotation {

	public static void main(String[] args) {
		array_totation obj= new array_totation();
		obj.rotate_by_k();
		

	}

}
