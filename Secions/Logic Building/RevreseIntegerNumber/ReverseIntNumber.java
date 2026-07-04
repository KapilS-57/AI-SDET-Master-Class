package RevreseIntegerNumber;

import java.util.Scanner;

public class ReverseIntNumber {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Integer number : ");
        int number = scanner.nextInt();
		int reverseNumber = 0;
		int lastDigit;
		
		
		while(number != 0) {
		lastDigit = number % 10;
        //		Check Overflow Condition
		if(reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && lastDigit > 7 )) {
			System.out.println(0);
			System.exit(0);
		}
//		Check Underflow condition
		if(reverseNumber > Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && lastDigit < -8 )) {
			System.out.println(0);
			System.exit(0);
		}
		reverseNumber = reverseNumber * 10 + lastDigit;
		number = number / 10;
		}
		
		System.out.println("Reversed Number : " + reverseNumber);
		scanner.close();

	}

}
