import java.util.Scanner;

public class _02_PrimeNumber_Half {
	
	/*
	 * Optimize Approach
	 * Method to check whether a number is prime or not by checking divisibility from 2 to n/2.
	 * 
	 * Time Complexity: O(n/2) ≈ O(n)
	 * Space Complexity: O(1)
	 */
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		
		// Check divisibility from 2 to n/2
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		} 

		return true;
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
