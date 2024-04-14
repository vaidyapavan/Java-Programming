package Basic_java;







import java.util.*;




class matrix_addition
{
	Scanner s= new Scanner(System.in);
	int m=3;
	int n=3;
	int arr1[][]= new int[m][n];
	int arr2[][]=new int[m][n];
	int arr3[][]= new int[m][n];
	
	 public void input()
	{
		
		
		
		System.out.println("enter matrix 1 of 3*3");
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
		System.out.println("enter matrix 2 of 3*3");
		
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            	 arr2[i][j] = s.nextInt();
                
            }
        }
		
		
		
	}
	void addition()
	{
		
		
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
	}
	
	void show()
	{
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println(" ");
        }
	}
	
}
public class Matrix_addition2 {

	public static void main(String[] args) {
		matrix_addition obj = new matrix_addition();
		obj.input();
		obj.addition();
		obj.show();
		
		

	}

}
