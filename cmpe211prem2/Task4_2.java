/**
 * CMPE211 Object Oriented Programming
 * 2021 Fall
 * Preliminary Work #2
 * Task 4
 * 
 */
package cmpe211prem2;

import java.util.Scanner;

/**
 * @author: Taha Ünsal
 * 
 */
public class Task4_2 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();
	   
		int sum = sumOfEnds(n);
	   
		if (sum == -1) {
			System.out.println("Error, number is single digit.");
		} else {
			System.out.println("Sum of first and last digit is: " + sum);
		}
	}

	public static int sumOfEnds(int num) {
		public static int sumOfEnds(int num) {
			String numStr = String.valueOf(Math.abs(num));

			if (numStr.length() < 2)
				return -1; // error

			int lastDigit  = Math.abs(num) % 10; // numStr.charAt(numStr.length() - 1) - '0';
			int firstDigit = numStr.charAt(0) - '0';

			return firstDigit + lastDigit;
		}
	}

}
