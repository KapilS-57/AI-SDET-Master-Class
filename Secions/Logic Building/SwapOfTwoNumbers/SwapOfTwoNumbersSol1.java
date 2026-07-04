package SwapOfTwoNumbers;
import java.util.Scanner;

public class SwapOfTwoNumbersSol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        // Extra temp variable is used to hold the value of a while we assign the value of b to a, and then we assign the value of temp (which holds the original value of a) to b.
        // but this is not the best approach as it uses an extra variable. We can swap two numbers without using a third variable by using arithmetic operations or bitwise XOR operation.

        System.out.println("After swap: a = " + a + ", b = " + b);
        scanner.close();
    }
}