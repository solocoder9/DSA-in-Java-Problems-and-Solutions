import java.util.Scanner;

public class _06_PrimeNumber_SieveOfEratosthenes {
	
	/*
	 * Optimal Approach
	 * Method to check if a number is prime by using Sieve of Eratosthenes for single number check (by marking composites up to n).
	 * 
	 * Time Complexity: O(n log log n)
	 * Space Complexity: O(n)
	 */
	public static boolean isPrime(int n) {
		// If number is less than 2, it's not prime
		if (n < 2) {
			return false;
		}
		// Create an array to mark composites
		boolean[] isComposite = new boolean[n + 1];
		// Mark composites starting from 2
		for (int i = 2; i * i <= n; i++) {
			if (!isComposite[i]) {
				/*
				 * Start marking multiples from i * i because smaller multiples
				 * (like i * 2, i * 3, ..., i * (i - 1)) are already marked by smaller primes
				 */
				for (int j = i * i; j <= n; j += i) {
					isComposite[j] = true;
				}
			}
		}
		// If n is not marked as composite, it's prime
		return !isComposite[n];
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println(isPrime(n) ? "Prime number" : "Not a Prime number");

		sc.close();
	}
}
