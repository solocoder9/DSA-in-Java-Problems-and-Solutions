import java.util.Scanner;

public class _03_PrimeNumber_SquareRoot {
	
	/*
	 * More Optimize Approach
	 * Method to check whether a number is prime or not by checking divisibility from 2 to sqrt(n).
	 * 
	 * Time Complexity: O(sqrt(n))
	 * Space Complexity: O(1)
	 */
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		
		// Check divisibility from 2 to sqrt(n)
		for (int i = 2; i <= Math.sqrt(n); i++) {
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
