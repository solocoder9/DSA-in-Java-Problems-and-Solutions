import java.util.Scanner;

public class _03_FindDivisors_SquareRootAsc {
	
	/*
	 * Optimal Approach
	 * Method to find divisors of a number by using iterative check
	 * 
	 * Time Complexity: O(sqrt(n))
	 * Space Complexity: O(1)
	 */
	public static void findDivisors(int n) {
		
		// Divisors come in pairs (i and n/i), so we only loop up to √n and print smaller divisors (i).
		int i = 0;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

		// Print larger devisors (n / i) in ascending order
		for (; i >= 1; i--) {
			if (n % i == 0 && i != n / i) { // avoid duplicate when n is perfect square
				System.out.print(n / i + " ");
			}
		}
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		findDivisors(n);

		sc.close();
	}
}
