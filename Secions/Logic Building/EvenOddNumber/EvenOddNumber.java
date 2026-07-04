package EvenOddNumber;

import java.util.Scanner;

public class EvenOddNumber {
    	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        
//        if (number % 2 == 0) {
//        	System.out.println("Enetered number is : Even Number.");
//        }
//        else {
//        	System.out.println("Enetered number is : Odd Number.");
//        }
        
        if ((number & 1) == 1) {
        	System.out.println("Enetered number is : Odd Number.");
        }
        else {
        	System.out.println("Enetered number is : Even Number.");
        }
		
	}
}
