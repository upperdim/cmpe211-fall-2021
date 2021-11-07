/**
 * CMPE211 Object Oriented Programming
 * 2021 Fall
 * Preliminary Work #2
 * Task 3
 * 
 */
package cmpe211prem2;

/**
 * @author: Taha Ünsal
 * 
 */
public class Task3 {

	public static void main(String args[]) {
		int TOTAL_ROWS = 8;
		
		for (int row = 0; row < TOTAL_ROWS; ++row) {
			for (int space = TOTAL_ROWS; space > row; --space) {
				System.out.print(" ");
			}

			int num = 1;
			for (int j = 0; j <= row; ++j) {
				System.out.print(num + " ");
				num = (num * (row - j)) / (j + 1);
			}

			System.out.print("\n");
		}
   }

}
