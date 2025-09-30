import java.util.Scanner;

public class _03_CountDigits_String {
	// Method to count digits of a positive number, using String conversion
	public static int countDigits(int n) {
		if (n == 0) {
			return 1;
		}
		
		if ( n < 0) {
			// Handle negative input by converting to positive
			n = Math.abs(n);
		}
		
		return (n + "").length();
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println("Number of digits is: " + countDigits(n));

		sc.close();
	}
}
