package Array;



class equilibrium
{
	int arr[]= {2,3,5,4,1};
	int n= arr.length-1;
	
	void check() {
		for(int i=0;i<n;i++)
		{
			int left_sum=0;
			int right_sum=0;
			for(int j=i;j>=0;j--)
			{
				left_sum=left_sum+arr[j];
				
			}
			for(int k=0;k<n;k++)
			{
				 right_sum= right_sum+arr[k];
				
			}
			if( right_sum==left_sum)
			{
				System.out.println("Equilibrium  point is at index: "+i);
			}
			
			
		}
	}
}
public class Equilibrium_point {

	public static void main(String[] args) {
		equilibrium obj= new equilibrium();
		obj.check();
		

	}

}
