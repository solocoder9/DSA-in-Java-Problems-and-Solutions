import java.util.Scanner;

public class _01_FindPrimeFactors_Iterative {

	/*
	 * Optimal Approach
	 * Method to print all prime factors of a given number n by iterative division.
	 * 
	 * Time Complexity: O(√n)
	 * Space Complexity: O(1)
	 */
	public static void findPrimeFactors(int n) {

		for(int i = 2; i * i <= n; i++) {
			// While i divides n, print i and divide n by i
			while(n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}

		// If remaining n is greater than 1, it is a prime factor
		if(n != 1) {
			System.out.print(n);
		}
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		findPrimeFactors(n);

		sc.close();
	}
}
