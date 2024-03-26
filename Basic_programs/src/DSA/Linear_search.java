package DSA;

public class Linear_search {

	public static void main(String[] args) {
		int arr[]= {12,5,6,89,0,23,57,89,87,56};
		
		int val=87;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==val)
			 {
				 System.out.println("Value is found at position at:"+ " "+ i);
			 }
			 
		 }
	}

}
