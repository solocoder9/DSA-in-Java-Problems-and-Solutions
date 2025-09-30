import java.util.Scanner;

public class _04_EvenOrOdd_Shift {
	// Method to check whether the number is even or odd using bitwise shift operators.
	// Right shift by 1 (integer division by 2), left shift by 1 (integer multiplication by 2).
	// If the final result equals the original number, the number is even.
	public static boolean isEven(int n) {
		return (n >> 1) << 1 == n;
	}

	// Driver code 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println(isEven(n) ? "Even number" : "Odd number");

		sc.close();
	}
}
