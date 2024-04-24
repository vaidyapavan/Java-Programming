package DSA;

public class Bubblesort {

	public static void main(String[] args) {
		 int arr[]= {20,30,90,3,1,8,40};
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=0;j<arr.length-1-i;j++)
			 {
				 int temp;
				 if(arr[j]>arr[j+1]) {
					 temp= arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
				 }
			 }
			 
		 }
		 
		 System.out.println("sorted array is:");
		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
			 
			 
		 }
		

	}

}
