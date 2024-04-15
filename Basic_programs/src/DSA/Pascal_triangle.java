package DSA;

class PascalTriangle {
	
	// Function to generate and print Pascal's triangle
	void generatePascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {
			// Print spaces for alignment
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			int num = 1;
			// Calculate and print the numbers in the current row
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

public class Pascal_triangle  {

	public static void main(String[] args) {
		PascalTriangle pascalTriangle = new PascalTriangle();
		pascalTriangle.generatePascalTriangle(5); // Change the parameter to adjust the number of rows
	}
}
