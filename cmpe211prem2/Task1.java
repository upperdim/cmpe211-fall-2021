/**
 * CMPE211 Object Oriented Programming
 * 2021 Fall
 * Preliminary Work #2
 * Task 1
 * 
 */
package cmpe211prem2;

import java.util.Scanner;

/**
 * @author: Taha Ünsal
 * 
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double distToOrigin = Math.sqrt(x*x + y*y);

		if (distToOrigin <= 10.0) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
		}
	}

}
