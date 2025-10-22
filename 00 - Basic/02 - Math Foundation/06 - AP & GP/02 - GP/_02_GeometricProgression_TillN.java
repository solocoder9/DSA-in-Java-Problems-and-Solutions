import java.util.Scanner;

public class _02_GeometricProgression_TillN {

	/*
	 * Method to generate and print all terms of a Geometric Progression (GP) till n.
	 *
	 * Time Complexity: O(log₍r₎(n)) – number of terms is proportional to log base r of n
	 * Space Complexity: O(1)
	 */
	public static void generateGPTermsTillN(int a, int r, int n) {

		// Print GP terms while they are <= n
		for (int term = a; term <= n; term *= r) {
			System.out.print(term + " ");
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

		generateGPTermsTillN(a, r, n);

		sc.close();
	}
}
