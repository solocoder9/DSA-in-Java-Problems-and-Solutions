import java.util.Scanner;

public class _02_TrailingZerosInFactorial_FactorsOfFive {

	/*
	 * Optimal Approach
	 * Method to find the number of trailing zeros in a factorial using factors of 5..
	 * 
	 * Time Complexity: O(log₅(n))
	 * Space Complexity: O(1)
	 */
	public static int findTrailingZerosInFactorial(int n) {

		int res = 0;
		// Count multiples of 5, 25, 125, 625, ...
		for (int i = 5; n / i != 0; i *= 5) {
			res += n/i;
		}

		return res;
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
