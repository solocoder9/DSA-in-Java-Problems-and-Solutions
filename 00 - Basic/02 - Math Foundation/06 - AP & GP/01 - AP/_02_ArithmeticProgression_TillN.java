import java.util.Scanner;

public class _02_ArithmeticProgression_TillN {
	
	/*
	 * Method to generate and print all terms of an Arithmetic Progression (AP) till n.
	 * 
	 * Time Complexity: O(n/d)
	 * Space Complexity: O(1)
	 */
	public static void generateAPTermsTillN(int a, int d, int n) {

		// Print all terms till 'n' in AP starting with 'a' and difference 'd'
		for (int term = a; term <= n; term += d) {
			System.out.print(term + " ");
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

		generateAPTermsTillN(a, d, n);

		sc.close();
	}
}
