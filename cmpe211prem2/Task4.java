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
public class Task4 {

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
		int length = String.valueOf(Math.abs(num)).length();
	  
		if (length < 2)
			return -1; // error
		 
		int lastDigit  = Math.abs(num) % 10;
		int firstDigit = getFirstDigit(num);
	  
		return firstDigit + lastDigit;
	}

	public static int getFirstDigit(int num) {
		num = Math.abs(num);
	  
		while (num >= 10)
			num /= 10;

		return num;
	}

}
