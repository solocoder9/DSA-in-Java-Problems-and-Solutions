import java.util.Scanner;

public class _02_FindPrimes_SieveOfEratosthenes {

	/*
	 * Optimal Approach
	 * Method to generate all prime numbers from 2 to n using the Sieve of Eratosthenes.
	 * 
	 * Time Complexity: O(n log log n)
	 * Space Complexity: O(n)
	 */
	public static void findPrimes(int n) {

		if (n < 2) {
			System.out.println("No primes available.");
			return;
		}

		boolean[] isComposite = new boolean[n + 1]; // false by default
		// Mark non-prime numbers
		for (int i = 2; i * i <= n; i++) {
			if (!isComposite[i]) {
				/*
				 * Start marking multiples from i * i because smaller multiples
				 * would have already been marked by smaller primes.
				 */
				for (int j = i * i; j <= n; j += i) {
					isComposite[j] = true;
				}
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (!isComposite[i]) {
				System.out.print(i + " ");
			}
		}
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		findPrimes(n);

		sc.close();
	}
}
