package Basic_java;


class  odd_element
{
	void find_unique_element()
	{
		int arr[] = {1, 4, 6, 8, 9,12,8,1,4,6,9,};
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 arr[i]=-1;
					 arr[j]=-1;
				 }
			 }
			 
			 
		 }
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>=0)
			 {
				 System.out.println("uniqueue element is: "+arr[i]);
			 }
		 }
		
	}
	 
	
}
public class Array_pair_element {

	public static void main(String[] args) {
		 odd_element obj= new  odd_element();
		 obj.find_unique_element();
		

	}

}
