import java.util.Scanner;

public class _03_ArithmeticProgression_NthTerm {
	
	/*
	 * Method to find the nth term of an Arithmetic Progression (AP).
	 *
	 * Time Complexity: O(1)
	 * Space Complexity: O(1)
	 */
	public static int findNthTermAP(int a, int d, int n) {

		// Tn = a + (n - 1) * d
		return a + (n - 1) * d;
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

		System.out.println("Nth term of AP: " + findNthTermAP(a, d, n));

		sc.close();
	}
}
