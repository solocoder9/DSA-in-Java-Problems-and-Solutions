import java.util.Scanner;

public class _01_TrailingZerosInFactorial_Iterative {
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

	/*
	 * Brute Force Approach
	 * Method to find the number of trailing zeros in a factorial using an iterative approach.
	 * 
	 * Time Complexity: O(n) // Because of findFactorial()
	 * Space Complexity: O(1)
	 */
	public static int findTrailingZerosInFactorial(int n) {

		long factorial = findFactorial(n);
		int countTrailingZero = 0;

		while (factorial > 0) {
			long rem = factorial % 10;
			if (rem != 0) {
				break;
			} else {
				countTrailingZero++;
			}
			factorial /= 10;
		}

		return countTrailingZero;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println("Trailing zeros: " + findTrailingZerosInFactorial(n));

		sc.close();
	}
}
