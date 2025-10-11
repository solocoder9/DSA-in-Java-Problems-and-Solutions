import java.util.Scanner;

public class _04_ArithmeticProgression_SumOfAP {
	
	/*
	 * Method to calculate the sum of the first n terms of an Arithmetic Progression (AP).
	 *
	 * Time Complexity: O(1) 
	 * Space Complexity: O(1)
	 */
	public static int sumOfAP(int a, int d, int n) {

		// Sn = n/2 * (2a + (n - 1) * d)
		return n * (2 * a + (n - 1) * d) / 2;
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first term a: ");
		int a = sc.nextInt();
		System.out.print("Enter the common difference d: ");
		int d = sc.nextInt();
		System.out.print("Enter the number of terms n: ");
		int n = sc.nextInt();

		System.out.println("Sum of first n terms: " + sumOfAP(a, d, n));

		sc.close();
	}
}
