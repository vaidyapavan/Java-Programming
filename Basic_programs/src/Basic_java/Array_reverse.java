package Basic_java;

public class Array_reverse {

	public static void main(String[] args) {
		int arr[]= {2,6,7,8,3,1,2,9};
	int arrlen=arr.length-1;
	int j=arrlen;
	for(int i=0;i<j;i++,j--)
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	System.out.println("Reverse Array is:");
	
	for(int i=0;i<arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}

	}

}
