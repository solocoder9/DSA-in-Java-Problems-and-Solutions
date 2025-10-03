import java.util.Scanner;

public class _01_LcmOfTwoNumbers_Iterative {

	/*
	 * Brute Force Approach
	 * Method to find the LCM / LCD of two numbers, Iterative check
	 * LCM: Least Common Multiple
	 * LCD: Least Common Divisor
	 * 
	 * Time Complexity: O(a * b - max(a, b))
	 * Space Complexity: O(1)
	 */
	public static int findLCM(int a, int b) {
		int lcm = Math.max(a, b);

		while (true) {
			if (lcm % a == 0 && lcm % b == 0) {
				break;
			}
			lcm++;
		}
		
		return lcm;
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