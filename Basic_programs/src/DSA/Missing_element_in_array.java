package DSA;

public class Missing_element_in_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
		
		int srrsy_element_sum=0;
		int total_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			srrsy_element_sum=srrsy_element_sum+arr[i];
			
		}
		for(int i=1;i<=6;i++)
		{
			total_sum=total_sum+i;
			
			
		}
		
		System.out.println(srrsy_element_sum);
		System.out.println(total_sum);
		int missing_no;
		missing_no=total_sum-srrsy_element_sum;
		System.out.println("misssing element is:"+ " "+ missing_no);
		
		

	}

}
