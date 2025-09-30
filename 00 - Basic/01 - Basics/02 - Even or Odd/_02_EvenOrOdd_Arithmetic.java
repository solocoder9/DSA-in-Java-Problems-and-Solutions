import java.util.Scanner;

public class _02_EvenOrOdd_Arithmetic {
	// Method to check whether the number is even or odd, using division & multiplication
	public static boolean isEven(int n) {
		return (n / 2) * 2 == n;
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
