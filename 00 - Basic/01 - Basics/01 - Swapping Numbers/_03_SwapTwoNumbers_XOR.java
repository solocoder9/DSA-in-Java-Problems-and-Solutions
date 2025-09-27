import java.util.Scanner;

public class _03_SwapTwoNumbers_XOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();

		// Swap two numbers using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swap: a = " + a + ", b = " + b);

		sc.close();
	}
}
