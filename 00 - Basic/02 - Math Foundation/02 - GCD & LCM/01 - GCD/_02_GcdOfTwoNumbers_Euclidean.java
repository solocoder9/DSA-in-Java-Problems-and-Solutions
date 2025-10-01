import java.util.Scanner;

public class _02_GcdOfTwoNumbers_Euclidean {

	/*
	 * Optimize Approach
	 * Method to find the GCD / HCF using Euclidean Algorithm (repeated subtraction)
	 * 
	 * Time Complexity: O(max(a, b))
	 * Space Complexity: O(1)
	 */
	public static int findGCD(int a, int b) {
		
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}

		return a; // or b, since a == b
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