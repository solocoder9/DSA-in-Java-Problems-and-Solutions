import java.util.Scanner;

public class _01_CountDigits_Division {
	// Method to count digits of a positive number, using Division
	public static int countDigits(int n) {

		if (n == 0) {
			return 1;
		}
		
		if ( n < 0) {
			// Handle negative input by converting to positive
			n = Math.abs(n);
		}
		
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}

		return count;
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
