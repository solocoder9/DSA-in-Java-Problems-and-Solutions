import java.util.Scanner;

public class _03_GeometricProgression_NthTerm {

	/*
	 * Method to calculate the nth term of a Geometric Progression (GP).
	 *
	 * Time Complexity: O(1)
	 * Space Complexity: O(1)
	 */
	public static int findNthTermGP(int a, int r, int n) {

		// Tn = a * r^(n - 1)
		return a * (int)Math.pow(r, n - 1);
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

		System.out.println("Nth term of GP: " + findNthTermGP(a, r, n));

		sc.close();
	}
}
