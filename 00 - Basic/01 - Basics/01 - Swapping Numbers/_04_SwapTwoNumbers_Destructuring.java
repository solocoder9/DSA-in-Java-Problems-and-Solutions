import java.util.Scanner;

public class _04_SwapTwoNumbers_Destructuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        // Swap two numbers using destructuring assignment (Java 14 or later)
        a = a + b - (b = a);
        
        System.out.println("After swap: a = " + a + ", b = " + b);

        sc.close();
    }
}
