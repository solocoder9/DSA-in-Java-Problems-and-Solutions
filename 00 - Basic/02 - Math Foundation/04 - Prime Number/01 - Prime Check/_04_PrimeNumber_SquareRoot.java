import java.util.Scanner;

public class _04_PrimeNumber_SquareRoot {
	
	/*
	 * More Optimize 2 Approach
	 * Method to check whether a number is prime or not by checking divisibility from 3 to sqrt(n).
	 * 
	 * Time Complexity: O(sqrt(n))
	 * Space Complexity: O(1)
	 */
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true; // 2 is a prime number
		}
		// Check for divisibility by 2
		if (n % 2 == 0) {
			return false; 
		}

		
		// Check divisibility from 3 to sqrt(n), skip even numbers
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
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
