import java.util.Scanner;

public class _03_GcdOfTwoNumbers_Euclidean {

	/*
	 * More Optimize Approach
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