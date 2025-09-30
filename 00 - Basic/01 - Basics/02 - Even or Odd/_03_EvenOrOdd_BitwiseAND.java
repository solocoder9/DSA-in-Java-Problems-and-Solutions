import java.util.Scanner;

public class _03_EvenOrOdd_BitwiseAND {
	// Method to check whether the number is even or odd, using Bitwise AND (&) Operator
	public static boolean isEven(int n) {
		return (n & 1) == 0;
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
