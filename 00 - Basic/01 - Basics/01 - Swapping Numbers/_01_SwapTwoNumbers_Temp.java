import java.util.Scanner;

public class _01_SwapTwoNumbers_Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();

		// Swap two numbers using temporary variable
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap: a = " + a + ", b = " + b);

		sc.close();
	}
}
