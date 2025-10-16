import java.util.Scanner;

public class _01_GeometricProgression_NTerms {

	/*
	 * Method to generate and print the first n terms of a Geometric Progression (GP).
	 *
	 * Time Complexity: O(n) 
	 * Space Complexity: O(1)
	 */
	public static void generateGPTerms(int a, int r, int n) {

		// Print first n terms of GP
		for (int i = 0; i < n; i++) {
			System.out.print((a * (int)Math.pow(r, i)) + " ");
		}
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first term a: ");
		int a = sc.nextInt();
		System.out.print("Enter the common ratio r: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of terms n: ");
		int n = sc.nextInt();

		generateGPTerms(a, r, n);

		sc.close();
	}
}
