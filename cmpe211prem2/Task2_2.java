/**
 * CMPE211 Object Oriented Programming
 * 2021 Fall
 * Preliminary Work #2
 * Task 2
 * 
 */
package cmpe211prem2;

/**
 * @author: Utku Helvacı
 * @author: Taha Ünsal
 * 
 */
public class Task2_2 {

	public static void main(String[] args) {
		int mature = 0, child = 1;
		for (int month = 0; month < 24; ++month) {
			int tmp = mature; // Each mature pair will have a pair of children
			mature += child;  // Children of previous month has grown up
			child = tmp;      // New children count
		}

		System.out.println("Number of rabbit pairs at the end of the 24th month is: " + (mature + child));
	}

}
