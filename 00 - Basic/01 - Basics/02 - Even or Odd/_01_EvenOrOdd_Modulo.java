import java.util.Scanner;

public class _01_EvenOrOdd_Modulo {
	// Method to check whether the number is even or odd, using modulo operator
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	// Driver code 
	public static void main(String[] args) {
		// Take user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		if (isEven(n)) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

		sc.close();
	}
}
