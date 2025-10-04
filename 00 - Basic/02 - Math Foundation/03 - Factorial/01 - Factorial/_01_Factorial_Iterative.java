import java.util.Scanner;

public class _01_Factorial_Iterative {

	/*
	 * Optimize Approach
	 * Method to find the factorial of a number using an iterative approach.
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static long findFactorial(int n) {
		if (n <= 1) {
			return 1;
		}

		int factorial = 1; 
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}

		return factorial;
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println("Factorial of " + n + " is: " + findFactorial(n));

		sc.close();
	}
}
