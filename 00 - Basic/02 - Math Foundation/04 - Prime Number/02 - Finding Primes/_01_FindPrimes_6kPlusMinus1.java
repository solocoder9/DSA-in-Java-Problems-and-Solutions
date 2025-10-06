import java.util.Scanner;

public class _01_FindPrimes_6kPlusMinus1 {
	
	/*
	 * Optimal Approach
	 * Method to check whether a number is prime or not, using 6k ± 1 optimization.
	 * 
	 * Time Complexity: O(sqrt(n))
	 * Space Complexity: O(1)
	 */
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true; // 2 and 3 are prime
		}
		// Check for divisibility by 2 or 3
		if (n % 2 == 0 || n % 3 == 0) {
			return false; 
		}

		
		// Check divisibility from 5 to sqrt(n), increment by 6
		for (int i = 5; i * i <= n; i += 6) {
			// 6k ± 1, where k is a natural number
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		} 

		return true;
	}

	/*
	 * Brute Force Approach
	 * Method to generate all prime numbers from 2 to n using iterative prime check.
	 * 
	 * Time Complexity: O(n√n)
	 * Space Complexity: O(1)
	 */
	public static void findPrimes(int n) {

		if (n < 2) {
			System.out.println("No primes available.");
			return;
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
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
