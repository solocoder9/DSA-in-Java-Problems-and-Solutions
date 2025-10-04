import java.util.Scanner;

public class _02_LcmOfTwoNumbers_Euclidean {

	/*
	 * Optimize Approach
	 * Method to find the GCD / HCF using Euclidean Algorithm (repeated modulus)
	 * 
	 * Time Complexity: O(log(min(a, b)))
	 * Space Complexity: O(1)
	 */
	public static int findGCD(int a, int b) {

		while (b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		
		return a;
	}

	/*
	 * Optimize Approach
	 * Method to find the LCM / LCD of two numbers, using Euclidean Algorithm
	 * LCM: Least Common Multiple
	 * LCD: Least Common Divisor
	 * 
	 * Time Complexity: O(log(min(a, b)))  // Because it depends on findGCD()
	 * Space Complexity: O(1)
	 */
	public static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();

		System.out.println("LCM of " + n1 + " and " + n2 + " is: " + findLCM(n1, n2));

		sc.close();
	}
}