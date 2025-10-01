import java.util.Scanner;

public class _01_GcdOfTwoNumbers_Iterative {

	/*
	 * Brute Force Approach
	 * Method to find the GCD / HCF of two numbers, Iterative check
	 * GCD: Greatest Common Devisor
	 * HCF: Highest Common Factor
	 * 
	 * Time Complexity: O(min(a, b))
	 * Space Complexity: O(1)
	 */
	public static int findGCD(int a, int b) {
		int lowest = (a < b) ? a : b;

		int gcd = 0;
		for (int i = lowest; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();

		System.out.println("GCD of " + n1 + " and " + n2 + " is: " +findGCD(n1, n2));

		sc.close();
	}
}