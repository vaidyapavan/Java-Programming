package Basic_java;

class prefix
{
	
	int arr[]= {78,90,34,12,56,8,2,4,5,6};
	int n= arr.length-1;
	void show()
	{
		
		System.out.println("Original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		
		}
		System.out.println(" ");
		
		
		
	}
	void prefix_()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				arr[j+1]=arr[i]+arr[j];
			}
		}
	}
	
		void updated()
		{
			System.out.println("updated array is:");
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			
			}
			
		}
		
}
public class Prefix_sum {

	public static void main(String[] args) {
		prefix obj= new prefix();
		obj.show();
		obj.prefix_();
		obj.updated();
	}
		

	

}
