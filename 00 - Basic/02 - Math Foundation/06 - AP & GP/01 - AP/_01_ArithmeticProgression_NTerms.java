import java.util.Scanner;

public class _01_ArithmeticProgression_NTerms {
	
	/*
	 * Method to generate and print the first n terms of an Arithmetic Progression (AP).
	 * 
	 * Time Complexity: O(n) 
	 * Space Complexity: O(1)
	 */
	public static void generateAPTerms(int a, int d, int n) {

		// Print first n terms of AP
		for (int i = 0; i < n; i++) {
			System.out.print((a + i * d) + " ");
		}
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first term a: ");
		int a = sc.nextInt();
		System.out.print("Enter the common difference d: ");
		int d = sc.nextInt();
		System.out.print("Enter the number of terms n: ");
		int n = sc.nextInt();

		generateAPTerms(a, d, n);

		sc.close();
	}
}
