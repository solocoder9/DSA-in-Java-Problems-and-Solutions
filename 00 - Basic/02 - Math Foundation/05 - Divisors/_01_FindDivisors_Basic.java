import java.util.Scanner;

public class _01_FindDivisors_Basic {
	
	/*
	 * Brute Force Approach
	 * Method to find divisors of a number by using iterative check
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void findDivisors(int n) {
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
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
