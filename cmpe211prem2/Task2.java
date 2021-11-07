/**
 * CMPE211 Object Oriented Programming
 * 2021 Fall
 * Preliminary Work #2
 * Task 2
 * 
 */
package cmpe211prem2;

/**
 * @author: Taha Ünsal
 * 
 */
public class Task2 {

	public static void main(String[] args) {
		int a = 1; // variable a is the first  month initially
		int b = 2; // variable b is the second month initially
		int c = 0;
		for (int i = 3; i <= 24; ++i) {
			c = a + b;
			a = b;
			b = c;
		}

		System.out.println("Number of rabbit pairs at the end of 24th month is: " + c);
	}

}
